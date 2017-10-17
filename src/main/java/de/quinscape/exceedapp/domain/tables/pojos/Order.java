/**
 * This class is generated by jOOQ
 */
package de.quinscape.exceedapp.domain.tables.pojos;


import de.quinscape.exceed.runtime.domain.GeneratedDomainObject;

import java.io.Serializable;
import java.sql.Timestamp;

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
public class Order extends GeneratedDomainObject implements Serializable {

	private static final long serialVersionUID = 1638635341;

	private String    id;
	private Long      sum;
	private String    trackingNumber;
	private Integer   shippingType;
	private String    status;
	private String    customerId;
	private String    number;
	private Timestamp accepted;

	public Order() {}

	public Order(Order value) {
		this.id = value.id;
		this.sum = value.sum;
		this.trackingNumber = value.trackingNumber;
		this.shippingType = value.shippingType;
		this.status = value.status;
		this.customerId = value.customerId;
		this.number = value.number;
		this.accepted = value.accepted;
	}

	public Order(
		String    id,
		Long      sum,
		String    trackingNumber,
		Integer   shippingType,
		String    status,
		String    customerId,
		String    number,
		Timestamp accepted
	) {
		this.id = id;
		this.sum = sum;
		this.trackingNumber = trackingNumber;
		this.shippingType = shippingType;
		this.status = status;
		this.customerId = customerId;
		this.number = number;
		this.accepted = accepted;
	}

	@NotNull
	@Size(max = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@NotNull
	public Long getSum() {
		return this.sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	@Size(max = 255)
	public String getTrackingNumber() {
		return this.trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@NotNull
	public Integer getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(Integer shippingType) {
		this.shippingType = shippingType;
	}

	@NotNull
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@NotNull
	@Size(max = 36)
	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@NotNull
	@Size(max = 36)
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Timestamp getAccepted() {
		return this.accepted;
	}

	public void setAccepted(Timestamp accepted) {
		this.accepted = accepted;
	}
}
