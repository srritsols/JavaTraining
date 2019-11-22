package inheritance.practice.khushi;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;



public class OptionMenu extends Account {
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
	
	//Validate Login Information customer number and pin number
	public void getLogin() throws IOException {
		int x =1;
		
		do {
			try {
				//Input integer, integer value for account and pin number
				data.put(98776, 1106);
				data.put(99876, 1945);
				
				System.out.println("Welcome to ATM Demo!!");
				
				//Ask customer to put account number
				System.out.println("Enter your Account Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				//Ask customer to put pin number
				System.out.println("Enter you pin: ");
				setPinNumber(menuInput.nextInt());			
			} catch (Exception e) {
				System.out.println("\n" + "Invalid character(s). Only Numbers." + "\n");
				x = 2;
			}
			for (Entry<Integer,Integer> entry : data.entrySet()) {
				if (entry.getKey() == getCustomerNumber() &&  entry.getValue()== getPinNumber());
				getAccountType();		
			}
		}
		while (x == 1);
	}

	//Display Account Type with menu option
	public void getAccountType() {
		System.out.println(" Select the Account you want to acces: ");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			getChecking();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Bye, Thank you for using the ATM.");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." +"\n");
			getAccountType();
		
		}
	}
	
	//Get saving account menu
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Money");
		System.out.println("Type 3 - Deposit Money ");
		System.out.println("Type 4 - Exit ");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Saving Account Balance : " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Bye, Thank you for using ATM.");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." +"\n");
			getSaving();
		}
		
	}

	//Get Checking Menu
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Money");
		System.out.println("Type 3 - Deposit Money ");
		System.out.println("Type 4 - Exit ");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Checking Account Balance : " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Bye, Thank you for using ATM.");
			break;
			
		default:
			System.out.println("\n" + "Invalid Choice." +"\n");
			getChecking();
		}
	}
	

}
