package basics;

import java.util.Scanner;

public class StackP22 
{
	public static void main(String[] args)
	{
	  System.out.println("enter your expression");
	  Scanner kb=new Scanner(System.in);
	  String s=kb.next();
	  MyStack stack=new MyStack();
      if(stack.checkBalPar(s))
      {
    	  System.out.println("parenthesis is balanced");
      }
      else
    	  System.out.println("parenthesis is not balanced");
	}

}
