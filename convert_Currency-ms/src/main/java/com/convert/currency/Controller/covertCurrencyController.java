package com.convert.currency.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.convert.currency.Service.ConvertService;
import com.convert.currency.model.CurrencyRequest;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@RestController

public class covertCurrencyController {

	@Autowired
	ConvertService convertService;
	
	
	
	@PostMapping("/convert-currency/convertcurrency")
	@CircuitBreaker(name="manageCurrencyConversion", fallbackMethod="testConversionFactorFallback" )
	public ResponseEntity<?> convertCurrency(@RequestBody CurrencyRequest request ){
		
		return  ResponseEntity.ok(convertService.convertCurrency(request));
		
	}
	
    public ResponseEntity<?> testConversionFactorFallback(CurrencyRequest request, Throwable t){
		
    	return new ResponseEntity<String>("In fallback method", HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	}
	
	


