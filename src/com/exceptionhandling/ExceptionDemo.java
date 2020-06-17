package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemo {

	public static void main(String args[])
	{
		
		PrintWriter ptr;
		try {
			ptr = new PrintWriter("abc.text");
			ptr.write("hello"); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doStuff();
	}
	public static void doStuff()
	{
		try {
		doMoreStuff();
		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		System.out.println("hello rishabh sharma");
	}
	public static void doMoreStuff()
	{
	System.out.println(10/0);
	}

}