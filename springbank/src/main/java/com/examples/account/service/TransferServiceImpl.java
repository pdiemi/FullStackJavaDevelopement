package com.examples.account.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.account.domain.Account;
import com.examples.account.repository.AccountRepository;

@Service(value="transferService")
public class TransferServiceImpl implements TransferService {

	private final AccountRepository accountRepository;
	@Autowired
	public TransferServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public void transfer(double amount, String srcAcctId, String destAcctId) {
		Account srcAcct = accountRepository.findById(srcAcctId);
		Account destAcct = accountRepository.findById(destAcctId);

		srcAcct.debit(amount);
		destAcct.credit(amount);

		accountRepository.update(srcAcct);
		accountRepository.update(destAcct);
	}
}
