/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables;


import de.quinscape.exceedapp.domain.Keys;
import de.quinscape.exceedapp.domain.Shipping;
import de.quinscape.exceedapp.domain.tables.records.ProductRecord;

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
public class Product extends TableImpl<ProductRecord> {

	private static final long serialVersionUID = -281350215;

	/**
	 * The reference instance of <code>shipping.product</code>
	 */
	public static final Product PRODUCT = new Product();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProductRecord> getRecordType() {
		return ProductRecord.class;
	}

	/**
	 * The column <code>shipping.product.id</code>.
	 */
	public final TableField<ProductRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.product.name</code>.
	 */
	public final TableField<ProductRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>shipping.product.description</code>.
	 */
	public final TableField<ProductRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>shipping.product.price</code>.
	 */
	public final TableField<ProductRecord, Long> PRICE = createField("price", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>shipping.product.number</code>.
	 */
	public final TableField<ProductRecord, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>shipping.product.discontinued</code>.
	 */
	public final TableField<ProductRecord, Boolean> DISCONTINUED = createField("discontinued", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>shipping.product</code> table reference
	 */
	public Product() {
		this("product", null);
	}

	/**
	 * Create an aliased <code>shipping.product</code> table reference
	 */
	public Product(String alias) {
		this(alias, PRODUCT);
	}

	private Product(String alias, Table<ProductRecord> aliased) {
		this(alias, aliased, null);
	}

	private Product(String alias, Table<ProductRecord> aliased, Field<?>[] parameters) {
		super(alias, Shipping.SHIPPING, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ProductRecord> getPrimaryKey() {
		return Keys.PK_PRODUCT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ProductRecord>> getKeys() {
		return Arrays.<UniqueKey<ProductRecord>>asList(Keys.PK_PRODUCT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Product as(String alias) {
		return new Product(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Product rename(String name) {
		return new Product(name, null);
	}
}
