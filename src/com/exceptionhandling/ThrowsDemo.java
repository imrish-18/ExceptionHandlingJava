package com.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {

	public static void doStuff()   throws InterruptedException
	{
	doMoreStuff();
	
	}
	public static void doMoreStuff() throws InterruptedException
	{
	
		//Thread.sleep(10000);;
		System.out.println("hello");
	}
	public static void main(String[] args)  throws InterruptedException   {
		
doStuff();
try
{
	System.out.println("compiles");
	
		} /*
			 * catch(Exception e) { System.out.println(e.getMessage()); }
			 */
finally
{
	System.out.println();
}
	}

}
