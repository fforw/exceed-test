/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables.records;


import de.quinscape.exceedapp.domain.tables.Address;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record6<String, String, String, String, String, String> {

	private static final long serialVersionUID = -53120712;

	/**
	 * Setter for <code>shipping.address.id</code>.
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>shipping.address.id</code>.
	 */
	@NotNull
	@Size(max = 36)
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>shipping.address.recipient</code>.
	 */
	public void setRecipient(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>shipping.address.recipient</code>.
	 */
	@NotNull
	@Size(max = 120)
	public String getRecipient() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>shipping.address.address_line</code>.
	 */
	public void setAddressLine(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>shipping.address.address_line</code>.
	 */
	@NotNull
	@Size(max = 120)
	public String getAddressLine() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>shipping.address.address_extra</code>.
	 */
	public void setAddressExtra(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>shipping.address.address_extra</code>.
	 */
	@Size(max = 120)
	public String getAddressExtra() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>shipping.address.postal</code>.
	 */
	public void setPostal(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>shipping.address.postal</code>.
	 */
	@NotNull
	@Size(max = 120)
	public String getPostal() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>shipping.address.country</code>.
	 */
	public void setCountry(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>shipping.address.country</code>.
	 */
	@NotNull
	@Size(max = 120)
	public String getCountry() {
		return (String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, String, String, String, String> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return Address.ADDRESS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return Address.ADDRESS.RECIPIENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Address.ADDRESS.ADDRESS_LINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return Address.ADDRESS.ADDRESS_EXTRA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Address.ADDRESS.POSTAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return Address.ADDRESS.COUNTRY;
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
	public String value2() {
		return getRecipient();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getAddressLine();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getAddressExtra();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPostal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value2(String value) {
		setRecipient(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value3(String value) {
		setAddressLine(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value4(String value) {
		setAddressExtra(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value5(String value) {
		setPostal(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value6(String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(Address.ADDRESS);
	}

	/**
	 * Create a detached, initialised AddressRecord
	 */
	public AddressRecord(String id, String recipient, String addressLine, String addressExtra, String postal, String country) {
		super(Address.ADDRESS);

		setValue(0, id);
		setValue(1, recipient);
		setValue(2, addressLine);
		setValue(3, addressExtra);
		setValue(4, postal);
		setValue(5, country);
	}
}
