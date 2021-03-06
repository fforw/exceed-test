/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables;


import de.quinscape.exceedapp.domain.Keys;
import de.quinscape.exceedapp.domain.Shipping;
import de.quinscape.exceedapp.domain.tables.records.AppLoginRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class AppLogin extends TableImpl<AppLoginRecord> {

	private static final long serialVersionUID = -622439434;

	/**
	 * The reference instance of <code>shipping.app_login</code>
	 */
	public static final AppLogin APP_LOGIN = new AppLogin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AppLoginRecord> getRecordType() {
		return AppLoginRecord.class;
	}

	/**
	 * The column <code>shipping.app_login.id</code>.
	 */
	public final TableField<AppLoginRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.app_login.username</code>.
	 */
	public final TableField<AppLoginRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>shipping.app_login.series</code>.
	 */
	public final TableField<AppLoginRecord, String> SERIES = createField("series", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>shipping.app_login.token</code>.
	 */
	public final TableField<AppLoginRecord, String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>shipping.app_login.last_used</code>.
	 */
	public final TableField<AppLoginRecord, Timestamp> LAST_USED = createField("last_used", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * Create a <code>shipping.app_login</code> table reference
	 */
	public AppLogin() {
		this("app_login", null);
	}

	/**
	 * Create an aliased <code>shipping.app_login</code> table reference
	 */
	public AppLogin(String alias) {
		this(alias, APP_LOGIN);
	}

	private AppLogin(String alias, Table<AppLoginRecord> aliased) {
		this(alias, aliased, null);
	}

	private AppLogin(String alias, Table<AppLoginRecord> aliased, Field<?>[] parameters) {
		super(alias, Shipping.SHIPPING, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AppLoginRecord> getPrimaryKey() {
		return Keys.PK_APP_LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AppLoginRecord>> getKeys() {
		return Arrays.<UniqueKey<AppLoginRecord>>asList(Keys.PK_APP_LOGIN, Keys.UC_APP_LOGIN_SERIES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AppLogin as(String alias) {
		return new AppLogin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AppLogin rename(String name) {
		return new AppLogin(name, null);
	}
}
