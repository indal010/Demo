package basics;

import java.util.Scanner;

public class TripletSumZero
{
	public static void main(String[] args)
	{
		System.out.println("how many number you have??");
		Scanner kb=new Scanner(System.in);
        int num=kb.nextInt();
        int[] a=new int[num];
        System.out.println("Enter the element");
        for(int i=0;i<num;i++)
        	a[i]=kb.nextInt();
        int n=sumIsZero(a);
        System.out.println();
        System.out.println("total triplets are "+n);
        }
	 public static int sumIsZero(int[] a)
	 {
		 int count=0;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 for(int k=j+1;k<a.length;k++)
				 {
					 if(a[i]+a[j]+a[k]==0)
					 {
						 System.out.print("("+a[i]+","+a[j]+","+a[k]+") ");
			               count++;
					 }
				 }
			 }
		 }
		 return count;
	 }
	}


