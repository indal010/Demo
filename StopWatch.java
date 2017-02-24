package basics;
import java.util.Scanner;
class StopWatch1
{
	public long start()
	{
		return System.currentTimeMillis();
	}
	public long stop()
	{
		return System.currentTimeMillis();
	}
}
class StopWatch 
{
	public static void main(String[] args)
	{
		countTime();
		
	}
	public static void countTime()
	{
		boolean flag=false;
		long startTimer=0,endTimer=0;
		int input=0;
		System.out.println("press 1 to start the stopwatch and 0 to stop it");
		Scanner kb=new Scanner(System.in);
		StopWatch1 s1=new StopWatch1();
		char c='n';
		while(input==1||c!='y')
		{
		System.out.println("enter your input to start stopwatch");
			input=kb.nextInt();
		if(input==1)
		{
			flag=true;
			startTimer=s1.start();
			break;
		}
		else 
		{
			System.out.println("if you want to exit press  y otherwise press n");
			c=kb.next().charAt(0);
		}
	}
	if(c!='y')
	{
		System.out.println("if you want to stop and to see the elapsed time enter 0");
		do
		{
			input=kb.nextInt();
		if(input==0&&flag==true)
		{
			flag=false;
			endTimer=s1.stop();
			System.out.println("elapsed time is: "+(endTimer-startTimer)/1000+" seconds");
		}
		else
			{
			System.out.println("please!! provide the proper input to stop the stopwatch");
			}
		}while(input!=0);
	}
}
}
