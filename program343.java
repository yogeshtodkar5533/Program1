import java.lang.*;
import java.util.*;

class program343
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the number :");
			
		char Arr[] = (Integer.toString(sobj.nextInt())).toCharArray();
		
		for(int i=Arr.length;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(Arr[j]+"  ");
			}
			System.out.println();
		}
	}
}