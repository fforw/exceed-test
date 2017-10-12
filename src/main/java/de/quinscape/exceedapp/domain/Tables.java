/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain;


import de.quinscape.exceedapp.domain.tables.Address;
import de.quinscape.exceedapp.domain.tables.AppState;
import de.quinscape.exceedapp.domain.tables.AppTranslation;
import de.quinscape.exceedapp.domain.tables.AppUser;
import de.quinscape.exceedapp.domain.tables.Customer;
import de.quinscape.exceedapp.domain.tables.Order;
import de.quinscape.exceedapp.domain.tables.OrderItem;
import de.quinscape.exceedapp.domain.tables.Product;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in shipping
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table shipping.address
	 */
	public static final Address ADDRESS = de.quinscape.exceedapp.domain.tables.Address.ADDRESS;

	/**
	 * The table shipping.app_state
	 */
	public static final AppState APP_STATE = de.quinscape.exceedapp.domain.tables.AppState.APP_STATE;

	/**
	 * The table shipping.app_translation
	 */
	public static final AppTranslation APP_TRANSLATION = de.quinscape.exceedapp.domain.tables.AppTranslation.APP_TRANSLATION;

	/**
	 * The table shipping.app_user
	 */
	public static final AppUser APP_USER = de.quinscape.exceedapp.domain.tables.AppUser.APP_USER;

	/**
	 * The table shipping.customer
	 */
	public static final Customer CUSTOMER = de.quinscape.exceedapp.domain.tables.Customer.CUSTOMER;

	/**
	 * The table shipping.order
	 */
	public static final Order ORDER = de.quinscape.exceedapp.domain.tables.Order.ORDER;

	/**
	 * The table shipping.order_item
	 */
	public static final OrderItem ORDER_ITEM = de.quinscape.exceedapp.domain.tables.OrderItem.ORDER_ITEM;

	/**
	 * The table shipping.product
	 */
	public static final Product PRODUCT = de.quinscape.exceedapp.domain.tables.Product.PRODUCT;
}
