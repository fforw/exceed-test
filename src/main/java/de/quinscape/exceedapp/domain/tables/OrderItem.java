/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables;


import de.quinscape.exceedapp.domain.Keys;
import de.quinscape.exceedapp.domain.Shipping;
import de.quinscape.exceedapp.domain.tables.records.OrderItemRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderItem extends TableImpl<OrderItemRecord> {

	private static final long serialVersionUID = -1333184974;

	/**
	 * The reference instance of <code>shipping.order_item</code>
	 */
	public static final OrderItem ORDER_ITEM = new OrderItem();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<OrderItemRecord> getRecordType() {
		return OrderItemRecord.class;
	}

	/**
	 * The column <code>shipping.order_item.id</code>.
	 */
	public final TableField<OrderItemRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.order_item.quantity</code>.
	 */
	public final TableField<OrderItemRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>shipping.order_item.product_id</code>.
	 */
	public final TableField<OrderItemRecord, String> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>shipping.order_item.order_id</code>.
	 */
	public final TableField<OrderItemRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * Create a <code>shipping.order_item</code> table reference
	 */
	public OrderItem() {
		this("order_item", null);
	}

	/**
	 * Create an aliased <code>shipping.order_item</code> table reference
	 */
	public OrderItem(String alias) {
		this(alias, ORDER_ITEM);
	}

	private OrderItem(String alias, Table<OrderItemRecord> aliased) {
		this(alias, aliased, null);
	}

	private OrderItem(String alias, Table<OrderItemRecord> aliased, Field<?>[] parameters) {
		super(alias, Shipping.SHIPPING, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<OrderItemRecord> getPrimaryKey() {
		return Keys.PK_ORDER_ITEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<OrderItemRecord>> getKeys() {
		return Arrays.<UniqueKey<OrderItemRecord>>asList(Keys.PK_ORDER_ITEM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<OrderItemRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<OrderItemRecord, ?>>asList(Keys.ORDER_ITEM__FK_ORDER_ITEM_PRODUCT_ID, Keys.ORDER_ITEM__FK_ORDER_ITEM_ORDER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderItem as(String alias) {
		return new OrderItem(alias, this);
	}

	/**
	 * Rename this table
	 */
	public OrderItem rename(String name) {
		return new OrderItem(name, null);
	}
}
