package controlstatements.practice.preethi;
import java.util.Random;
import java.util.Scanner;
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
		
		//TODO here..
		//For loop
		int []arr=new int[5];
		int sum=0;
		Random rd=new Random();
		for(int i=0;i<arr.length;i++)
		arr[i]=rd.nextInt();
		// Do while loop
		int i=0;
		do
		{
			sum+=arr[i];
			i++;
		}while(i<arr.length);
		int i1=0;
		// While loop
		while(i1<arr.length)
		{
			System.out.println(arr[i1]);
			i1++;
		}
        int max=0;
        for(int j=arr.length-1;j>=0;j--)
        {
        if(arr[j]>max)
          max=arr[j];
        }
        System.out.println("The highest number is" + max);
        System.out.println("The Average number is" + (sum/(arr.length)));
        for(int i2=0;i2<arr.length;i2++)
        {
        	if(arr[i2]>(sum/arr.length))
        	System.out.println(arr[i2]+ " is greater than" + (sum/arr.length));
        	else
        	continue;
        } 
        // Switch Case
        double d1,d2,result;
        int flag=0;
        d1=0;d2=0;result=0;
        char operator;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        d1=scanner.nextDouble();
        System.out.println("Enter the second number");
        d2=scanner.nextDouble();
        System.out.print("Enter an operator");
        operator=scanner.next().charAt(0);
        switch(operator)
        {
        case'+':
        	result=d1+d2;
        	break;
        case'-':
        	result=d1-d2;
        	break;
        case'*':
        	result=d1*d2;
            break;
        case'/':
        	result=d1/d2;
        	break;
        case'%':
        	result=d1%d2;
        	break;
        default: 
        	System.out.println("Invalid operator");
        	flag=1;
        }
        //If else
        if((flag==0))
        	System.out.println("The result is "+ result);
        else
        	System.out.println("Enter a valid operator");
        int a,b;
        System.out.println("Enter the first number");
        a=scanner.nextInt();
        System.out.println("Enter the second number");
        b=scanner.nextInt(); //Logical Operations
        System.out.println("a | b =" + (a|b ));
        System.out.println("a & b =" + (a&b ));
        System.out.println("a ^ b =" + (a^b ));
        scanner.close();
        
	}  
}
