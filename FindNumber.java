import java.util.Scanner;
class FindNumber
{ 
 public static void main(String[] args)
   {
    int x=Integer.parseInt(args[0]);
    System.out.println("Enter your number");
     Scanner kb=new Scanner(System.in);
    int num=kb.nextInt();
   if(binarySearch(0,x-1,num))
        System.out.println("your input has matched successfully");
   else
         System.out.println("sorry!! your input did not match");
  }
 public static boolean binarySearch(int min,int max,int search)
  {
 if(min>max)
    return false;
   if((min+max)/2==search)
 {
  System.out.println((min+max)/2);
       return true;
 }
    else if((min+max)/2>search)
       {
        System.out.print((min+max)/2+" ");    
    return binarySearch(min,(min+max)/2-1,search);
           
      }
           else if((min+max)/2<search)
        {
           System.out.print((min+max)/2+" ");
          return binarySearch((min+max)/2+1,max,search);  
      } 
  }
}
 
