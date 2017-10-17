/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables.records;


import de.quinscape.exceedapp.domain.tables.Order;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record8<String, Long, String, Integer, String, String, String, Timestamp> {

	private static final long serialVersionUID = 2036765311;

	/**
	 * Setter for <code>shipping.order.id</code>.
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>shipping.order.id</code>.
	 */
	@NotNull
	@Size(max = 36)
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>shipping.order.sum</code>.
	 */
	public void setSum(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>shipping.order.sum</code>.
	 */
	@NotNull
	public Long getSum() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>shipping.order.tracking_number</code>.
	 */
	public void setTrackingNumber(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>shipping.order.tracking_number</code>.
	 */
	@Size(max = 255)
	public String getTrackingNumber() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>shipping.order.shipping_type</code>.
	 */
	public void setShippingType(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>shipping.order.shipping_type</code>.
	 */
	@NotNull
	public Integer getShippingType() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>shipping.order.status</code>.
	 */
	public void setStatus(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>shipping.order.status</code>.
	 */
	@NotNull
	public String getStatus() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>shipping.order.customer_id</code>.
	 */
	public void setCustomerId(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>shipping.order.customer_id</code>.
	 */
	@NotNull
	@Size(max = 36)
	public String getCustomerId() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>shipping.order.number</code>.
	 */
	public void setNumber(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>shipping.order.number</code>.
	 */
	@NotNull
	@Size(max = 36)
	public String getNumber() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>shipping.order.accepted</code>.
	 */
	public void setAccepted(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>shipping.order.accepted</code>.
	 */
	public Timestamp getAccepted() {
		return (Timestamp) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, Long, String, Integer, String, String, String, Timestamp> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<String, Long, String, Integer, String, String, String, Timestamp> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Order.ORDER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return Order.ORDER.SUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Order.ORDER.TRACKING_NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Order.ORDER.SHIPPING_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Order.ORDER.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Order.ORDER.CUSTOMER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return Order.ORDER.NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return Order.ORDER.ACCEPTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getSum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTrackingNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getShippingType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCustomerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getAccepted();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value2(Long value) {
		setSum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value3(String value) {
		setTrackingNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value4(Integer value) {
		setShippingType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value5(String value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value6(String value) {
		setCustomerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value7(String value) {
		setNumber(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord value8(Timestamp value) {
		setAccepted(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public OrderRecord values(String value1, Long value2, String value3, Integer value4, String value5, String value6, String value7, Timestamp value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OrderRecord
	 */
	public OrderRecord() {
		super(Order.ORDER);
	}

	/**
	 * Create a detached, initialised OrderRecord
	 */
	public OrderRecord(String id, Long sum, String trackingNumber, Integer shippingType, String status, String customerId, String number, Timestamp accepted) {
		super(Order.ORDER);

		setValue(0, id);
		setValue(1, sum);
		setValue(2, trackingNumber);
		setValue(3, shippingType);
		setValue(4, status);
		setValue(5, customerId);
		setValue(6, number);
		setValue(7, accepted);
	}
}
