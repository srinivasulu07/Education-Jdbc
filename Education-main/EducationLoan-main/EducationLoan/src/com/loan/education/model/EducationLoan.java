package com.loan.education.model;
import com.loan.eduaction.dao.*;
import java.util.Scanner;

import com.loan.education.controller.UserValidation;
public class EducationLoan {

	Scanner sc = new Scanner(System.in);
	
	public static String userid;
	public String password;
	public static int result;
	public static String name;
	public static String emailid;
	public static String phoneno;
	public static String address;
	public static String citizenship;
	
	public static int age;
	public static long amount;
	public static int rank;
	public static int credit;
	public static int period;
	
//	public static int id=110;
//	public static int loanid=10;
	public int employeValid() {
		
		
		
		System.out.println("Enter userid: ");
		userid = sc.nextLine();
		
		System.out.println("Enter password: ");
		password = sc.nextLine();
		UserValidation usr = new UserValidation();
		result = usr.validateEmployee(userid,password);
		
		return result;

		
	}

	public void mainMethod() {
		new EducationLoan();
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		System.out.println("Enter your Emailid: ");
		emailid=sc.nextLine();
		System.out.println("Enter your Phoneno: ");
		phoneno=sc.nextLine();
		System.out.println("Enter your Address: ");
		address=sc.nextLine();
		System.out.println("Enter you Citizenship: ");
		citizenship=sc.nextLine();
		System.out.println("Enter your Age: ");
		age = sc.nextInt();
		UserValidation usr = new UserValidation();
		usr.validateAge(age);
//		Age a = new Age();
//		a.ageValidation();
		System.out.println("Enter your loan amount: ");
		amount =sc.nextLong();
//		Amount am=new Amount();
//		am.amountValidation();
		usr.validateAmount(amount);
		System.out.println("Enter the rank of college you are joining: ");
		rank = sc.nextInt();
//		CollegeRanking cr=new CollegeRanking();
//		cr.rankValidation();
		usr.validateRank(rank);
		System.out.println("Enter your creditscore: ");
		credit = sc.nextInt();
		
//		
		usr.validateCredit(credit);
		
		System.out.println("Enter your repaymentperiod: ");
		period = sc.nextInt();
//		Repaymentperiod rp =new Repaymentperiod();
//		rp.periodValidation();
		usr.validatePeriod(period);
		UserValidation u = new UserValidation();
		u.score();
		String st=u.status();
		int interest=u.approve();
		InsertPrepared ip=new InsertPrepared();
		ip.insert(6,name,phoneno,emailid,address,age,rank,credit);
		ip.insertinto(6,6,amount,period);
		ip.insertintof(6,6,st,interest);
		
		
	}
	
}
