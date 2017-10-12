/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables;


import de.quinscape.exceedapp.domain.Keys;
import de.quinscape.exceedapp.domain.Shipping;
import de.quinscape.exceedapp.domain.tables.records.OrderRecord;

import java.sql.Timestamp;
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
public class Order extends TableImpl<OrderRecord> {

	private static final long serialVersionUID = -1558008592;

	/**
	 * The reference instance of <code>shipping.order</code>
	 */
	public static final Order ORDER = new Order();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<OrderRecord> getRecordType() {
		return OrderRecord.class;
	}

	/**
	 * The column <code>shipping.order.id</code>.
	 */
	public final TableField<OrderRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.order.sum</code>.
	 */
	public final TableField<OrderRecord, Long> SUM = createField("sum", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>shipping.order.tracking_number</code>.
	 */
	public final TableField<OrderRecord, String> TRACKING_NUMBER = createField("tracking_number", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>shipping.order.shipping_type</code>.
	 */
	public final TableField<OrderRecord, Integer> SHIPPING_TYPE = createField("shipping_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>shipping.order.status</code>.
	 */
	public final TableField<OrderRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>shipping.order.customer_id</code>.
	 */
	public final TableField<OrderRecord, String> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>shipping.order.number</code>.
	 */
	public final TableField<OrderRecord, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.order.accepted</code>.
	 */
	public final TableField<OrderRecord, Timestamp> ACCEPTED = createField("accepted", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>shipping.order</code> table reference
	 */
	public Order() {
		this("order", null);
	}

	/**
	 * Create an aliased <code>shipping.order</code> table reference
	 */
	public Order(String alias) {
		this(alias, ORDER);
	}

	private Order(String alias, Table<OrderRecord> aliased) {
		this(alias, aliased, null);
	}

	private Order(String alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
		super(alias, Shipping.SHIPPING, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<OrderRecord> getPrimaryKey() {
		return Keys.PK_ORDER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<OrderRecord>> getKeys() {
		return Arrays.<UniqueKey<OrderRecord>>asList(Keys.PK_ORDER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<OrderRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<OrderRecord, ?>>asList(Keys.ORDER__FK_ORDER_CUSTOMER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Order as(String alias) {
		return new Order(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Order rename(String name) {
		return new Order(name, null);
	}
}
