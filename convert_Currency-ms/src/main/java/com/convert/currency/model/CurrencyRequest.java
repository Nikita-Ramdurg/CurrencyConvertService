package com.convert.currency.model;

public class CurrencyRequest {
	private String countryCode;
	private Double amount;
	
	public CurrencyRequest() {
		
	}
	
	public CurrencyRequest(String countryCode, Double amount) {
		super();
		this.countryCode = countryCode;
		this.amount = amount;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CurrencyRequest [countryCode=" + countryCode + ", amount=" + amount + "]";
	}
	
	

}
