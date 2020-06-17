package com.exceptionhandling;

public class TryCatchDemo {

	public static void main(String args[])
	{
		try
		{
			
			int a=10;
			System.out.println("code is going to be executed");
			int b=a/0;
			System.out.println("code has an exception");
		}
		
		/*
		 * catch (ArithmeticException e) {
		 * 
		 * System.out.println(e); }
		 */
		 
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("hello rishabh ");
		}
		System.out.println("code is excuted ");
	}
	
}
