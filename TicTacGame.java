package basics;

import java.util.Random;
import java.util.Scanner;

public class TicTacGame
{
	
	public static void main(String[] args)
	{
		int check=0;
		System.out.println("you need to put two index in order to mark the cell ");
		Random r=new Random();
		TicTacU obj=new TicTacU();
		int w=0;
		Scanner kb=new Scanner(System.in);
		int[][] a=new int[3][3];
		while(obj.empty(a))
		{
			int i=r.nextInt(3);
			int j=r.nextInt(3);
			if(a[i][j]==0)
			a[i][j]=1;
			else 
				continue;
			//obj.result(a,1);
			obj.display(a);
			if(!(obj.result(a,1,i,j)))
				{
				System.out.println("computer won");
				check++;
				break;
				}
			System.out.println("enter your index");
			int m=kb.nextInt();
			int n=kb.nextInt();
			if(a[m][n]==0)
		      a[m][n]=2;
			else
			{
				System.out.println("space has occupied\n try with another index");
				continue;
			}
		      obj.display(a);
		      if(!obj.result(a,2,m,n))
		      {
		    	  System.out.println("congratulation you won");
		    	  check++;
		    	  break;
		      }
			
			}
		if(check==0)
		System.out.println("ops!! game draw !! no one is winner");
		}
	}
			