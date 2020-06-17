package com.exceptionhandling;

import java.util.Scanner;
public class hackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String [] str=new String[2];
	
		for(int i=0;i<1;i++)
			str[i]=sc.next();
		for(int i=0;i<1;i++)
		{
			while(str[i].contains("()") || str[i].contains("{}") || str[i].contains("[]")) {
				str[i]=str[i].replaceAll("\\(\\)","").replaceAll("\\[\\]","").replaceAll("\\{\\}","");
			}
			if(str[i].length()==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		/*
		 * for(int i=0;i<1;i++) { char[] ch=str[i].toCharArray(); for(int
		 * j=0;j<ch.length/2;j++) { if((ch[j]=='[' && ch[ch.length-1-j]==']') ||
		 * (ch[j]=='{' && ch[ch.length-1-j]=='}') || (ch[j]=='(' &&
		 * ch[ch.length-1-j]==')') ) flag=1; else flag=0; } } if(flag==1)
		 * System.out.println("yes"); else System.out.println("no");
		 */
		}

}
