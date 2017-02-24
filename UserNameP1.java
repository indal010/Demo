package com.controller.bridgelabz.www;

import java.util.Scanner;

public class UserNameP1
{
	public static void main(String[] args)
	{
		System.out.println("enter your name");
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		if(s.length()>=3)
        System.out.println("hello "+s+", how are you ?");
		else
			System.out.println("please enter atleast three character");
	}

}
