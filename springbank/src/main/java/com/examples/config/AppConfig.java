package com.examples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.examples")

public class AppConfig {
	
	@Bean
	public InMemoryAccountRepository accountRepository() {
		return new InMemoryAccountRepository();
	}
	
	@Bean
	public TransferServiceImpl transferService() {
		return new TransferServiceImpl(accountRepository());
	}
}
