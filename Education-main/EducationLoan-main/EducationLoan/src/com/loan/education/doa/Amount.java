package com.loan.education.doa;

import com.loan.education.controller.UserValidation;

public class Amount {
	public long amount;

	public long getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}	
	public void amountValidation() {
		UserValidation usr = new UserValidation();
		usr.validateAmount(amount);
	}
}

