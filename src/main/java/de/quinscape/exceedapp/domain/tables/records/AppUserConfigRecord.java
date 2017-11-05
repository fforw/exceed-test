/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables.records;


import de.quinscape.exceedapp.domain.tables.AppUserConfig;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class AppUserConfigRecord extends UpdatableRecordImpl<AppUserConfigRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 724973869;

	/**
	 * Setter for <code>shipping.app_user_config.id</code>.
	 */
	public void setId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>shipping.app_user_config.id</code>.
	 */
	@NotNull
	@Size(max = 36)
	public String getId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>shipping.app_user_config.login</code>.
	 */
	public void setLogin(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>shipping.app_user_config.login</code>.
	 */
	@NotNull
	@Size(max = 64)
	public String getLogin() {
		return (String) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return AppUserConfig.APP_USER_CONFIG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AppUserConfig.APP_USER_CONFIG.LOGIN;
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
		return getLogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserConfigRecord value1(String value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserConfigRecord value2(String value) {
		setLogin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppUserConfigRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AppUserConfigRecord
	 */
	public AppUserConfigRecord() {
		super(AppUserConfig.APP_USER_CONFIG);
	}

	/**
	 * Create a detached, initialised AppUserConfigRecord
	 */
	public AppUserConfigRecord(String id, String login) {
		super(AppUserConfig.APP_USER_CONFIG);

		setValue(0, id);
		setValue(1, login);
	}
}
