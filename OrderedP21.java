package basics;

public class OrderedP21
{
	public static void main(String[] args)
	{
		OrderedListUtility obj=new OrderedListUtility();
    	String s=obj.readFile();
    	String[] str=s.split(" ");
		obj.orderedList();
		System.out.println("file contents are like this: \n"+s);
		
		for(int i=0;i<str.length-1;i++)
		{
			  obj.add(str[i]);
			//System.out.print(str[i]+" ");
		}
		System.out.println("after adding to linked list it get sorted, and list looks like below list\n");
        obj.display();
       obj.writeFiles("10");
       obj.display();
	}
}
