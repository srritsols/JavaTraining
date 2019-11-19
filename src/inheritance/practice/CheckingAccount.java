//<<<<<<< HEAD:src/inheritance/practice/CheckingAccount.java
package inheritance.practice;

import exceptions.practice.InsufficientFundsException;
//=======
//package.exceptions.practice;
//>>>>>>> 4ac55ccb90d5c77fe2d9d69e0769e19560431274:src/exceptions/practice/CheckingAccount.java

public class CheckingAccount {
	
	   private double balance;
	   private int number;
	   
	   public CheckingAccount(int number) {
	      this.number = number;
	   }
	   
	   public void deposit(double amount) {
	      balance += amount;
	   }
	   
	   public void withdraw(double amount) throws InsufficientFundsException {
	      if(amount <= balance) {
	         balance = balance - amount;
	      }else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
	   
	   public double getBalance() {
	      return balance;
	   }
	   
	   public int getNumber() {
	      return number;
	   }
	}