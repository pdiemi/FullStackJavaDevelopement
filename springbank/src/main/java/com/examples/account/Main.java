package com.examples.account;

//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.junit.Assert.assertThat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.examples.account.domain.Account;
import com.examples.account.repository.AccountRepository;
import com.examples.account.service.TransferService;
import com.examples.config.AppConfig;

public class Main {
    public static void main(String[] args) {
    	
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext( new String[]
		 * { "beans.xml" });
		 */
		
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
		// retrieve the beans we'll use during testing
		AccountRepository accountRepository = (AccountRepository) context.getBean("accountRepository");
		TransferService transferService = (TransferService) context.getBean("transferService");
		
		
		// create accounts to test against
		accountRepository.add(new Account("A123", 1000.00));
		accountRepository.add(new Account("C456", 0.00));
		
		System.out.println("accountRepository.findById(\"A123\").getBalance() = " + 
				accountRepository.findById("A123").getBalance());
		System.out.println("accountRepository.findById(\"C456\").getBalance() = " + 
				accountRepository.findById("C456").getBalance());

		// check account balances before transfer
		//assertThat(accountRepository.findById("A123").getBalance(), equalTo(1000.00));
		//assertThat(accountRepository.findById("C456").getBalance(), equalTo(0.00));

		// perform transfer
		System.out.println("Transfering 100 dollars from A123 to C456 ");
		transferService.transfer(100.00, "A123", "C456");
		
		System.out.println("accountRepository.findById(\"A123\").getBalance() = " + 
				accountRepository.findById("A123").getBalance());
		System.out.println("accountRepository.findById(\"C456\").getBalance() = " + 
				accountRepository.findById("C456").getBalance());

		// check account balances after transfer
		//assertThat(accountRepository.findById("A123").getBalance(), equalTo(900.00));
		//assertThat(accountRepository.findById("C456").getBalance(), equalTo(100.00));
		
    }
}
