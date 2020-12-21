package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int addressId;
	private String addressCity;
	private String addressCountry;
	public Address() {
		super();
	}
	public Address(int addressId, String addressCity, String addressCountry) {
		super();
		this.addressId = addressId;
		this.addressCity = addressCity;
		this.addressCountry = addressCountry;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", addressCity=" + addressCity + ", addressCountry=" + addressCountry
				+ "]";
	}
	
}
