package collection.list;
import java.util.Scanner;
public class List {
	public void  main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Collection<Object> list = new Collection<Object>();
		while(true)
		{
			System.out.println("Enter an option to perform the operation:\n 1.Add an element\n 2.Delete an element\n 3.Fetch the element\n 4.Print the List\n 5.Size of the list\n 6.Break\n");
			int N=sc.nextInt();
			if(N==1)
			{
				System.out.println("Enter the elment to be inserted:");
				int data=sc.nextInt();
				list.add(data);
			}
			else if(N==2)
			{
				System.out.println("Enter the position of element to be deleted:");
				int index=sc.nextInt();
				try
				{
					Object x=list.remove(index);
					System.out.println("Element removed is:"+x);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(N==3)
			{
				System.out.println("Enter the position of element to be fetched:");
				int ind=sc.nextInt();
				try
				{
					Object element=list.get(ind);
					System.out.println("Element is:"+element);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(N==4)
			{
				list.print();
			}
			else if(N==5)
			{
				int length=list.s();
				System.out.println("Size of the list is:"+length);
			}
			else if(N==6)
				break;
			else
			{
				System.out.println("Enter a valid option...");
			}
		}
		sc.close();
	}
}
