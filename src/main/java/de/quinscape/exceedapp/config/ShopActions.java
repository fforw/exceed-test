package de.quinscape.exceedapp.config;

import de.quinscape.exceed.model.annotation.ExceedPropertyType;
import de.quinscape.exceed.model.meta.PropertyType;
import de.quinscape.exceed.runtime.RuntimeContext;
import de.quinscape.exceed.runtime.action.Action;
import de.quinscape.exceed.runtime.action.ActionEnvironment;
import de.quinscape.exceed.runtime.action.CustomLogic;
import de.quinscape.exceed.runtime.domain.DomainObject;
import de.quinscape.exceedapp.OrderStatus;
import de.quinscape.exceedapp.domain.tables.pojos.Address;
import de.quinscape.exceedapp.domain.tables.pojos.Customer;
import de.quinscape.exceedapp.service.OrderService;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static de.quinscape.exceedapp.domain.Tables.*;
import static org.jooq.impl.DSL.*;

@CustomLogic
public class ShopActions
{
    private final static Logger log = LoggerFactory.getLogger(ShopActions.class);

    private final OrderService orderService;

    private final DSLContext dslContext;


    @Autowired
    public ShopActions(
        OrderService orderService,
        DSLContext dslContext
    )
    {
        this.orderService = orderService;
        this.dslContext = dslContext;
    }


    @Action
    public void shopCancelOrder(
        RuntimeContext runtimeContext,
        @ExceedPropertyType(type = PropertyType.DOMAIN_TYPE, typeParam = "Order")
            DomainObject domainObject
    )
    {
        domainObject.setProperty("status", OrderStatus.CANCELED.ordinal());
        domainObject.update(runtimeContext);

        orderService.cancelOrder(runtimeContext, domainObject);
    }


    @Action(
        env = ActionEnvironment.SERVER
    )
    public String newCustomerNumber()
    {
        final Integer maxNumber = dslContext.select(
                    max(
                        cast(
                            substring(
                                CUSTOMER.NUMBER,
                                2
                            ),
                            Integer.class
                        )
                    )
                )
                .from(CUSTOMER)
                .fetchOneInto(Integer.class);

        return String.format("A%08d", maxNumber + 1);
    }

    @Action(
        env = ActionEnvironment.SERVER
    )
    public String newOrderNumber()
    {
        final Integer maxNumber = dslContext.select(
                    max(
                        cast(
                            substring(
                                ORDER.NUMBER,
                                2
                            ),
                            Integer.class
                        )
                    )
                )
                .from(ORDER)
                .fetchOneInto(Integer.class);

        return String.format("B%08d", maxNumber == null ? 1 : maxNumber + 1);
    }


    /**
     * Example of an action method with generated domain parameters. The classes are generated from JOOQ on the basis of
     * of the database generated by exceed. They're specialized POJO containers for a single domain type and offer
     * Java bean property access to the properties of that domain type
     *
     * @param runtimeContext
     * @param customer              customer object
     * @param billingAddress        billing address object, connected to customer
     * @param hasDeliveryAddress    <code>true</code> if this object is supposed to have a delivery address
     * @param deliveryAddress       delivery address which might be an address object connected to the customer, it might
     *                              just be an empty collection of null values co
     */
    @Action
    public void shopSaveCustomer(
        RuntimeContext runtimeContext,
        Customer customer,
        Address billingAddress,
        boolean hasDeliveryAddress,
        Address deliveryAddress
    )
    {
        if (hasDeliveryAddress)
        {
            final String deliveryAddressId;
            if (deliveryAddress.getId() == null)
            {
                deliveryAddressId = UUID.randomUUID().toString();
                deliveryAddress.setId(deliveryAddressId);
            }
            else
            {
                deliveryAddressId = deliveryAddress.getId();
            }

            customer.setDeliveryAddressId(deliveryAddressId);

            deliveryAddress.insertOrUpdate(runtimeContext);
            billingAddress.insertOrUpdate(runtimeContext);
            customer.insertOrUpdate(runtimeContext);
        }
        else
        {
            // we're ignoring the delivery address

            customer.setDeliveryAddressId(null);
            
            deliveryAddress.insertOrUpdate(runtimeContext);
            billingAddress.insertOrUpdate(runtimeContext);
            customer.insertOrUpdate(runtimeContext);
        }
    }
}
