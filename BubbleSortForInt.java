package basics;

import java.util.Scanner;

public class BubbleSortForInt 
{
	public static void main(String[] args)
	{
		System.out.println("how many number do you want to sort???");
		Scanner kb=new Scanner(System.in);
		int size=kb.nextInt();
		System.out.println("enter "+size+" integer value");
		int[] a=new int[size];
		 for(int i=0;i<size;i++)
		 {
			 a[i]=kb.nextInt();
		 }
        a=bubbleSort(a);
        for(int i=0;i<a.length;i++)
        	System.out.print(a[i]+" ");
	}
    public static int[] bubbleSort(int[] a)
    {
    	int size=a.length;
    	for(int i=0;i<a.length-1;i++)
    	{
    		for(int j=0;j<size-1;j++)
    		{
    			if(a[j]>a[j+1])
    			{
    				a[j+1]=(a[j]-a[j+1])+(a[j]=a[j+1]);
    			}
    		}
    		size--;
    	}
    	return a;
    }
}
