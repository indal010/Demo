package basics;

import java.util.Random;
import java.util.Scanner;

public class RandomCoupon 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the distinct number of elements you have");
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		int[] a=new int[size];
		System.out.println("enter "+size+" distinct element");
		for(int i=0;i<size;i++)
		{
			a[i]=kb.nextInt();
		}
		System.out.println("enter the lowest number of your list");
		int min=kb.nextInt();
		System.out.println("enter the highest number of your list");
		int max=kb.nextInt();
		int range=max-min;
       int x=size;
       int count=0;
       Random r=new Random();      
       while(x!=0)
       {
    	   int getr=r.nextInt(range+1);
    	   for(int i=0;i<x;i++)
    	   {
    		   if(a[i]==getr+min)
    		   {
    			   if(x!=1)
    			   {
    			   for(int j=i;j<x-1;j++)
    				   a[j]=a[j+1];
    			   x--;
    			   break;
    			   }
    			   else 
    			   {
    				   x--;
    			   }
    		   }
    	   }
    	   count++;
       }
       System.out.println("the random process required is "+count);
	}

}
