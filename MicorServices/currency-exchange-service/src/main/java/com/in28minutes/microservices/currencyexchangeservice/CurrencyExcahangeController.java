package com.in28minutes.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.currencyexchangeservice.beans.ExchangeValue;
import com.in28minutes.microservices.currencyexchangeservice.repository.ExchangeValueRepository;

@RestController
public class CurrencyExcahangeController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExcahngeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchageValue = repository.findByFromAndTo(from, to);
		
		exchageValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}", exchageValue);
		
		return exchageValue;
	}
}
