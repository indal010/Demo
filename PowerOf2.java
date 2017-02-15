class PowerOf2
{
public static void main(String[] args)
{
 if(Integer.parseInt(args[0])>=0 && Integer.parseInt(args[0])<31)
  {
    for(int i=1;i<=Integer.parseInt(args[0]);i++)
    {
     System.out.println("2 ^"+i+" ="+pow(i));
     }
   }
  else
   System.out.println("entered number may lead the value to out of range");
}
public static int pow(int i)
{
  int pro=1;
   while(i!=0)
     {
      pro*=2;
      i--;
     }
return pro;
}
}
