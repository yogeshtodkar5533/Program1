import java.lang.*;
import java.util.*;

class program338
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string :");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(Arr[j]+"  ");
			}
			System.out.println();
		}
	}
}