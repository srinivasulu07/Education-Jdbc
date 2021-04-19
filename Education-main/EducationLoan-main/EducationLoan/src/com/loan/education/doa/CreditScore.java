package com.loan.education.doa;

import com.loan.education.controller.UserValidation;

public class CreditScore {
	public int creditscore;

	public int getCreditscore() {
		return creditscore;
	}

	public void setCreditscore(int creditscore) {
		this.creditscore = creditscore;
	}
	public void creditValidation() {
		UserValidation usr = new UserValidation();
		usr.validateCredit(creditscore);
	}

}
