package inheritance.practice.khushi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner (System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double savingBalance = 0;
	private double checkingBalance = 0;
	
	
	//Set the customer account number
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		
	}
	
	//Get the account number
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	//Set account pin number
	public int setPinNumber (int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	//Get the account pin number
	public int getPinNumber() {
		return pinNumber;
	}
	
	//Get Saving Account Balance
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Get Checking Account Balance
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	//Calculate Checking Withdrawal
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	//Calculate Saving Withdrawal
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	//Calculate checking Deposit
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	//Calculate saving Deposit
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	//Customer checking account withdraw input
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount to withdraw from checking account: ");
		double amount =input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance cannot be Negative");
		}
	}
	
	//Customer saving account withdraw input
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount to withdraw from saving account: ");
		double amount =input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
		}else {
			System.out.println("Balance cannot be Negative." + "\n");
		}
	}
	
	//Customer Checking account Deposit input
	public void getCheckingDepositInput() {
		System.out.println("Checking account Balance: " + moneyFormat.format(checkingBalance));
		System.out.println("Amount deposit to checking account: ");
	    double amount =input.nextDouble();
	    
	    if((checkingBalance + amount) >= 0) {
	    	calcCheckingDeposit(amount);
	    	System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance) + "\n");
	    } else {
	    	System.out.println("Balance cannot be Negative." + "\n");
	    }
	}
	
	//Customer saving account Deposit input
	public void getSavingDepositInput() {
		System.out.println("Saving account Balance: " + moneyFormat.format(savingBalance));
		System.out.println("Amount deposit to saving account: ");
	    double amount =input.nextDouble();
	    
	    if((savingBalance + amount) >= 0) {
	    	calcSavingDeposit(amount);
	    	System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance) + "\n");
	    } else {
	    	System.out.println("Balance cannot be Negative." + "\n");
	    }
	}
	

}
