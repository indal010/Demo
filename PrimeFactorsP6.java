package com.controller.bridgelabz.www;

import java.util.Scanner;

public class PrimeFactorsP6
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		primeFactors(n);

	}
	public static void primeFactors(int n)
	{
		for(int i=2;i/2<=n;i++)
		{
			if(n%i==0)
				if(isPrime(i))
					System.out.print(i+" ");
		}
	}
     public static boolean isPrime(int x)
     {
    	 int i=2;
    	 for(;i<=x/2;i++)
    	 {
    		 if(x%i==0)
    			 break;
    	 }
    	 if(i>x/2)
    		 return true;
    	 return false;
     }
}
