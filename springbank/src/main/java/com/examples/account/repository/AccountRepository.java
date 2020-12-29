package com.examples.account.repository;

import java.util.Set;

import com.examples.account.domain.Account;

public interface AccountRepository {

	Account findById(String acctId);

	void update(Account account);

	void add(Account account);

	Set<Account> findAll();

}
