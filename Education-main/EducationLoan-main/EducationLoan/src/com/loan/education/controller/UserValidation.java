package com.loan.education.controller;

import com.loan.education.model.EducationLoan;

public class UserValidation extends EducationLoan{

	public static int score = 0;

	public int validateEmployee(String userid, String password) {
		if (userid.equals("Srinivas")  && password.equals("Srinivas")) {
			
			return 1;
		}
		return 0;
	}

	public void validateAge(int age) {
		if (age >= 21 && age <= 35) {
			score++;
		}
	}
	public void validateAmount(long amount) {
		if (amount <= 700000) {
			score++;

		}
	}

	public void validateRank(int rank) {
		if (rank <= 200) {
			score++;
		}

	}

	public void validateCredit(int creditscore) {
		if (creditscore >= 700) {
			score++;
		}

	}

	public void validatePeriod(int period) {
		if (period <= 6) {
			score++;

		}
		System.out.println(score);
	}
	
		
	 
	public int  score() {
		// TODO Auto-generated method stub
		if (score>=3) {
			System.out.println("Based on your inputs You are eligible for eduaction loan and you will be notified for further process...");
			
			return 1;
		
		}
		else {
			System.out.println("You didn't meet the necessary criteria for education loan...");
			return 0;
		}
	}
	public String status() {
		UserValidation user=new UserValidation();
		if(user.score()==1) {
			String stat="Yes";
			return stat;
			
		}else {
			String stat="No";
			return stat;
		}
	}

	public int approve() {
		// TODO Auto-generated method stub
		UserValidation user=new UserValidation();
		if(user.score()==1) {
			if(EducationLoan.amount>500000) {
				int a=12;
				return a;
			}
			else if(EducationLoan.amount>1000000 && amount<200000){
				int a=16;
				return a;
			}
			else {
				return 0;
			}
		}
		return 0;
		
	}
	
}
