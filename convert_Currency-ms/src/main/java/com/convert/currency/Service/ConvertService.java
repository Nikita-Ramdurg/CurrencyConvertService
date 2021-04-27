package com.convert.currency.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.convert.currency.model.CurrencyRequest;
import com.convert.currency.model.CurrencyResponse;

@Service
public class ConvertService {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ConvertServiceproxy serviceproxy;

	public Double convertCurrency1(CurrencyRequest request) {
		return request.getAmount()*getConversionFactor(request.getCountryCode());
		
	}

	private Double getConversionFactor(String countryCode) {
		
		
		String Url="http://localhost:8888/Currency-conversion/"+countryCode;
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> dre = new HttpEntity<String>((String)null);

		ResponseEntity<CurrencyResponse> dResponseEntity = restTemplate.exchange(Url, HttpMethod.GET, dre,
				CurrencyResponse.class);
		return dResponseEntity.getBody().getConversionFactor();
		
		
	}
	
	public Double convertCurrency(CurrencyRequest request) {
		return request.getAmount()*getConversionFactorv1(request.getCountryCode());
		
	}

	private Double getConversionFactorv1(String countryCode) {
		CurrencyResponse response=serviceproxy.getConversionFactor(countryCode);
		return response.getConversionFactor();
	}

	

	
	
}
