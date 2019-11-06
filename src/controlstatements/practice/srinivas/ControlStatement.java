package controlstatements.practice.srinivas;

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
		
		int num1=20 ;
		int num2=10 ;
		int num3=5 ;
		
		
		
		//first if-else loop 
		if (num1 >= num2 ) {
			System.out.println ("num1 is greater than num2 ");
	    }
		else {
			System.out.println ("num2 is greater than num1 ");
		}
		
		//second if-else -if loop 
		if (num3>5) {
			System.out.println ("num3 is greater than 5   ");
		}
		else if (num3<5) {
			System.out.println ("num3 is less than 5  ");
		}
		else {
			System.out.println ("num3 is 5 ");
		}
		
		//for loop 
		for(int i=10; i>1; i--){
            System.out.println("The value of i is: "+i);
       }
		
		//while loop 
		 int k=10;
         while(k>1){
              System.out.println(k);
              k--;
         }
         
         //do while 
         int l=1;  
         do{  
             System.out.println("The value of l is: "+l);  
         l++;  
         }while(l<=10);
         
         //continue 
         int [] numbers = {10, 20, 30, 40, 50};
         for(int x : numbers ) {
            if( x == 30 ) {
               continue;
            }
            System.out.print( x );
            System.out.print("\n");
         }
         
         //switch , case , break 
         int day = 4;
         switch (day) {
           case 1:
             System.out.println("Monday");
             break;
           case 2:
             System.out.println("Tuesday");
             break;
           case 3:
             System.out.println("Wednesday");
             break;
           case 4:
             System.out.println("Thursday");
             break;
           case 5:
             System.out.println("Friday");
             break;
           case 6:
             System.out.println("Saturday");
             break;
           case 7:
             System.out.println("Sunday");
             break;
         }
         
         
         
	} 
}
