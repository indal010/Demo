package basics;

import java.util.Scanner;

public class InsertionSortp17
{
	public static void main(String[] args)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter a string");
		String s=kb.nextLine();
		s=insertionSorting(s);
		System.out.println(s);

	}
	public static String insertionSorting(String s)
	{
		String[] s1=s.split(" ");
		s="";
		 for(int i=0;i<s1.length;i++)
		 {
			 for(int j=i;j<s1.length-1;j++)
			 {
				 int flag=j;
				 String temp=s1[j+1];
				 while(flag>=0&&compare(s1[flag],temp))
				 {
						 s1[flag+1]=s1[flag];
						 flag--;
				  }
				 s1[flag+1]=temp;
			 }
		 }
		 for(int i=0;i<s1.length;i++)
			 s+=s1[i]+" ";
		 return s;
	}
   public static boolean compare(String s1,String s2)
   {
	   int length=0;
	   if(s1.length()>s2.length())
		   length=s2.length();
	   else
		   length=s1.length();
	      for(int i=0;i<length;i++)
	      {
	    	  if(s1.charAt(i)>s2.charAt(i))
	    		  return true;
	    	  else if(s1.charAt(i)<s2.charAt(i))
	    		  return false;
	    	  else
	    		  continue;
	    }
	      return false;
    }

}
