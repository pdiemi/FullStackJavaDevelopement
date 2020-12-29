package com.examples.account.service;

public interface TransferService {

	void transfer(double amount, String srcAcctId, String destAcctId);

}
