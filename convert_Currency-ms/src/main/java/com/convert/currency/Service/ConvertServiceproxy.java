package com.convert.currency.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.convert.currency.model.CurrencyResponse;



@FeignClient(name = "MANAGE-CURRENCYSERVICE-MS")
public interface ConvertServiceproxy {
	@RequestMapping(method = RequestMethod.GET, path = "/Currency-conversion/{CountryCode}")
	public CurrencyResponse getConversionFactor(@PathVariable("CountryCode") String countrycode);

}
