package datatypes.practice.khushi;

public class PrimitiveTypes {
	public static void main(String []args) {
		int myValue = 10000;
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		
		//print the minimum value store by data type in java
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		//print the maximum value store by data type in java
		System.out.println("Integer maximum value = " + myMaxIntValue);
		//print the maximum value store by datatype it wont change but if we - it it will change.
		System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
		//print the minimum value store by data type it wont change but if we add it will change.
		System.out.println("Busted Min Value = " + (myMinIntValue + 1));
		
		//max value if you increase it will show error
		int myMaxIntTest = 2_147_483_647;
		
		//code for byte data type
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimun Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		
		//code for short data type
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimun Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		
		//code for long data type
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimun Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		
		long bigLongLiteralValue = 2_147_483_647_234L;
		System.out.println("Big Long Literal Value = " + bigLongLiteralValue);
		
		short bigShortLiteralValue = 32767;
		System.out.println("Big Short Literal Value = " + bigShortLiteralValue);
		
		//Casting in Java. Casting means converting a number from one type to another.
		int myTotal =(myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		System.out.println("My new byte value is: " + myNewByteValue);
		short myNewShortValue =(short)(myMinShortValue / 2);
		System.out.println("My New short value is: "+ myNewShortValue);
		
		
		
		
	}

}
