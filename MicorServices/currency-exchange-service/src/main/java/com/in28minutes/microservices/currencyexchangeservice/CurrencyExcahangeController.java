package com.in28minutes.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.currencyexchangeservice.beans.ExchageValue;

@RestController
public class CurrencyExcahangeController {

	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchageValue retrieveExcahngeValue(@PathVariable String from, @PathVariable String to) {
		ExchageValue exchageValue = new ExchageValue(1000l, from, to, BigDecimal.valueOf(65));
		exchageValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchageValue;
	}
}
