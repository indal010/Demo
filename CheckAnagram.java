package basics;

import java.util.Scanner;

public class CheckAnagram 
{
	public static String rmSpace(String s)
	{
		char[] c=s.toCharArray();
		s="";
		for(int i=0;i<c.length;i++)
			if(c[i]!=' ')
				s+=c[i];
		return s;
	}
	public static String toLowerCase(String s)
	{
		char[] c=s.toCharArray();
		s="";
		for(int i=0;i<c.length;i++)
			{if(c[i]>=97&&c[i]<=122)
				s+=(char)(c[i]-32);
			else
				s+=c[i];
			}
		
			return s;
	}
	public static void main(String[] args)
	{
		System.out.println("enter a string");
		Scanner kb=new Scanner(System.in);
		String s1=kb.nextLine();
		System.out.println("enter another string");
		String s2=kb.nextLine();
		s1=rmSpace(s1);
		s2=rmSpace(s2);
        s1=toLowerCase(s1);
        s2=toLowerCase(s2);
      //  System.out.println(s1);
       // System.out.println(s2);
        if(sum(s1,s2))
        System.out.println("Strings are Anagram");
        else
        System.out.println("Strings are not Anagram");
	}
	public static boolean sum(String s2 , String s1)
	{
		int sum1=0,sum2=0;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			sum1+=c1[i];
			sum2+=c2[i];
		}
		if(sum1==sum2)
			return true;
		return false;				
	}

}
