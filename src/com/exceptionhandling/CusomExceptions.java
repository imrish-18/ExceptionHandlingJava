package com.exceptionhandling;
import java.util.Scanner;
class TooYoungException extends RuntimeException
{
	public TooYoungException(String s) {
	
	super(s);
	}
}
class TooOldException extends RuntimeException
{
	public TooOldException(String s) {
	super(s);
	}
}

public class CusomExceptions {
	static int x;

	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		if(age>60)
		{
		throw new TooYoungException("your age already crossed marriage age... no chance of getting married");
		}
		else if(age<18)
		{
			throw new TooOldException("please wait some more time.. you will get best match");
		}
		else
			System.out.println("you will get match by email");
	}
}
