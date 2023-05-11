package packg;


public class class1 {
	
	//Data type
	// two types 1. Primitive data type
	//		     2. Non-Primitive data type 
	
	
	// 1. Non-Primitive data type
			//1.String 2. class
	
	// 2. Primitive data type
			// 1. Numeric + Non-Decimal (don't use any comma. ex 10 20 50 101 etc...)
			// 2. Numeric + Decimal (write only f at the end 10.20f 20.89f, 93.25f
			// 3. Character (use only single inverted comma 'a' 's' 'r')
			// 4. Conditional (0 - 1  true false value only)
	
	
		public static void main (String[] args)	
{
		// variable declaration 
		//in this process declare which values/data type we are going to use 
		//ex. string, int, char, float etc
				
		String datatype;  
		//String is non-primitive data type to initialize always use double inverted. comma "information", memory of string is not defined (unlimited memory)
		
		//Primitive data type
		//1. Numeric+Non-Decimal
		byte byteinfo;
		short shortinfo;
		int intinfo;
		long longinfo;
		
		//2. Numeric+Non-Decimal
		float floatinfo;
		double doubleinfo;
		
		//3. Character
		char charinfo;
		
		
		//variable initialization
		//in this process we give some values/information to declared variable 
		
		datatype="Details of Data Type"; 
		//1. Numeric+Non-Decimal
		byteinfo=-128;
		shortinfo=-32768;
		intinfo=-214748368;
		longinfo=8421160677l;
		
		//2. Numeric+Decimal
		floatinfo=90.94f;
		doubleinfo=99.99f;
				
		//3. Character
		charinfo='S';
		
		//variable usage		
		//in this process declared variable are used 
		System.out.println(datatype);
		System.out.println(byteinfo);
		System.out.println(shortinfo);
		System.out.println(longinfo);
		System.out.println(floatinfo);
		System.out.println(doubleinfo);
		System.out.println(charinfo);
			
}
}