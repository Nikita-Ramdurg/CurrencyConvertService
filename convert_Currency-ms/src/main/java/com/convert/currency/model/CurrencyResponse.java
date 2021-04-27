package com.convert.currency.model;

public class CurrencyResponse {
	
	private String countryCode;
	private Double conversionFactor;
	
	public CurrencyResponse() {
		
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Double getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public CurrencyResponse(String countryCode, Double conversionFactor) {
		super();
		this.countryCode = countryCode;
		this.conversionFactor = conversionFactor;
	}
	@Override
	public String toString() {
		return "CurrencyResponse [countryCode=" + countryCode + ", conversionFactor=" + conversionFactor + "]";
	}
	
	
	

}
