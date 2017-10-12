/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables.pojos;


import de.quinscape.exceed.runtime.domain.GeneratedDomainObject;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class Customer extends GeneratedDomainObject implements Serializable {

	private static final long serialVersionUID = -983560748;

	private String id;
	private String salutation;
	private String number;
	private String name;
	private String billingAddressId;
	private String deliveryAddressId;

	public Customer() {}

	public Customer(Customer value) {
		this.id = value.id;
		this.salutation = value.salutation;
		this.number = value.number;
		this.name = value.name;
		this.billingAddressId = value.billingAddressId;
		this.deliveryAddressId = value.deliveryAddressId;
	}

	public Customer(
		String id,
		String salutation,
		String number,
		String name,
		String billingAddressId,
		String deliveryAddressId
	) {
		this.id = id;
		this.salutation = salutation;
		this.number = number;
		this.name = name;
		this.billingAddressId = billingAddressId;
		this.deliveryAddressId = deliveryAddressId;
	}

	@NotNull
	@Size(max = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Size(max = 50)
	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	@NotNull
	@Size(max = 36)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@NotNull
	@Size(max = 120)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotNull
	@Size(max = 36)
	public String getBillingAddressId() {
		return this.billingAddressId;
	}

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	@Size(max = 36)
	public String getDeliveryAddressId() {
		return this.deliveryAddressId;
	}

	public void setDeliveryAddressId(String deliveryAddressId) {
		this.deliveryAddressId = deliveryAddressId;
	}
}
