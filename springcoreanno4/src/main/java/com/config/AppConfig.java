package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.CurrentAccount;
import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;

@Configuration
@ComponentScan (basePackages="com")
public class AppConfig {

	@Bean
	public CurrentAccount currentAccount() {
		return new CurrentAccount();
	}
	@Bean
	public FixedAccount fixedAccount() {
		return new FixedAccount();
	}
	
	@Bean
	public SavingAccount savingAccount() {
		return new SavingAccount();
	}
	
	@Bean
	public CalculatorService service() {
		return new CalculatorService(currentAccount());
	}
}
