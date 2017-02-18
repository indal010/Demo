package basics;

import java.util.Scanner;
import java.io.*;
public class BinarySearchP16
{
	public static void main(String[] args)
	{
	 Scanner kb=new Scanner(System.in);
	// System.out.println("enter a string");
	 String s="";
     File f=new File("/home/bridgelabz/Documents/myjavaFiles/text");
     try
     {
     FileReader fr=new FileReader(f);
     char[] c=new char[(int)f.length()];
     fr.read(c);
     System.out.println("The content of your file is:");
     System.out.println(c);
      for(int i=0;i<c.length;i++)
    	  s+=c[i];
       s=sort(s);
       String[] s1=s.split(" ");
       //System.out.println(s);
       System.out.println("enter your searching String from the file");
       String search=kb.nextLine();
       if(found(0,s1.length-1,s1,search))
    	   System.out.println("yes , your element is present in the file");
       else
    	   System.out.println("sorry!!!   we did not find your element in the file");
     }
     catch(IOException e)
     {
    	 e.printStackTrace();
     }
	}
	public static boolean found(int min,int max,String[] s1,String search)
	{
		if(min>max)
			return false;
		int mid=(min+max)/2;
		if(search.equalsIgnoreCase(s1[mid]))
			return true;
		else if(compare(s1[mid],search))
			return found(min,mid-1,s1,search);
		else 
			 return found(mid+1,max,s1,search);
		}
	public static String sort(String s)
	{
		String[] s1=s.split(" ");
		s="";
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s1.length-1;j++)
			{
				if(compare(s1[j],s1[j+1]))
				{
					String temp=s1[j];
					s1[j]=s1[j+1];
					s1[j+1]=temp;
				}
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
