package controlstatements.practice.varsha;

public class ControlStatement {
	
	/**
	 * Please try to follow and create the following:
	 * 
	 *  1. Create multiple if-else-if statements
	 *  2. Create for, while and do-while loops
	 *  3. Create a method to use switch, case, break, continue statement. 
	 *  4. Add few arithmetic operations
	 *  5. Add few logical operators 	 
	 *  
	 */
	 
	public static void main(String[] args) { 
	//If else if 
		int num=1;
		if(num > 0 && num<10) {
		 System.out.println("Its a one digit number");
		}
		else if(num >=10 && num<100) {
		  System.out.println("Its a two digit number");
		}
		else if(num >=100 && num<1000) {
		  System.out.println("Its a three digit number");
		}
		else if(num >=1000 && num<10000) {
		  System.out.println("Its a four digit number");
		}
		else if(num >=10000 && num<100000) {
		  System.out.println("Its a five digit number");			
		}
		else {
		  System.out.println("number is not between 1 & 99999");			
		}
		//for loop
		for(int i=10; i>1; i--){
            System.out.println("The value of i is: "+i);
		}
		//while loop
		int i=1;
        while(i<10){
             System.out.println(i);
             i++;
        }
	    //Do while
        do{
             System.out.println(i);
             i--;
        }while(i>1);
	
        
        //switch case break 
        char operator;
    	Double number1 = (double) 198;
    	Double number2 = (double) 135;
    	Double result;
    	operator = '+' ;
    	
    	switch (operator) {
         case '-':
           result = number1 - number2;
    	   System.out.print(number1 + "-" + number2 + " = " + result);
           break;
         case '+':
           result = number1 + number2;
           System.out.print(number1 + "+" + number2 + " = " + result);
           break;
         case '*':
           result = number1 * number2;
           System.out.print(number1 + "*" + number2 + " = " + result);
           break;
         case '/':
           result = number1 / number2;
           System.out.print(number1 + "/" + number2 + " = " + result);
           break;
         default: 
           System.out.println("Invalid operator!");
           break;
        }      	
		
		
	} 
}
