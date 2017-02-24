package basics;
import java.io.*;
import java.util.Scanner;
public class PrintWriter2D 
{
	public static int[][] getInput()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("enter the row of the 2d Array");
		int row=kb.nextInt();
		System.out.println("enter the column of the 2d array");
		int col=kb.nextInt();
		int[][] a=new int[row][col];
		System.out.println("enter the element of the 2d array");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				a[i][j]=kb.nextInt();
		}
		return a;
	}
	public static void main(String[] args)
	{
		int[][] a=getInput();
		display(a);
	}
	public static void display(int[][] a)
	{
		PrintWriter pw=new PrintWriter(System.out);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				pw.print(a[i][j]+" ");
				pw.flush();
			}
			System.out.println();
		}
	}

}
