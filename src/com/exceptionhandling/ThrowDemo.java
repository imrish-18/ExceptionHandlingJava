package com.exceptionhandling;

public class ThrowDemo {
	   static void validate(int age){  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
	//static ArithmeticException e=new ArithmeticException();
	//static ArithmeticException ex;
// will give nullpointer exception because by default static variables value is null;
	public static void main(String[] args) {
		
	    validate(13);  
	      System.out.println("rest of the code...");  
		//throw new ArithmeticException("/ by 0");
		//System.out.println("hello rishabh sharma "); unreachable code
		
		//throw new ThrowDemo();
		//No exception of type ThrowDemo can be thrown; an exception type must be a subclass of Throwable

	}

}
