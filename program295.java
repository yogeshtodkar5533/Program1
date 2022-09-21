import java.lang.*;
import java.util.*;
import java.io.*;

class program295
{
	public static void main(String arg[])
	{
		try
		{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter directory/folder name");
		String foldername = sobj.nextLine();
		
		File dobj = new File(foldername);
		
		File allfiles[] = dobj.listFiles();
		String name;
		
		System.out.println("Please packed file name");
		String packfilename = sobj.nextLine();
		
		File fobj = new File(packfilename);
		boolean bobj = fobj.createNewFile();
		FileOutputStream writeobj = new FileOutputStream(fobj);
		
		FileInputStream readerobj = null;
		int ret = 0;
		byte buffer[] = new byte[100];
		
		for(int i=0; i<allfiles.length; i++)
		{
		    name = allfiles[i].getName();
			
			if(name.endsWith(".txt"))
			{
				name = name+" "+(allfiles[i].length());
				System.out.println(name);
				
				for(int j= name.length();j<100;j++)
				{
					name = name+" ";
				}
				
                byte namearray[] = name.getBytes();
				writeobj.write(namearray,0,namearray.length);
				
				readerobj = new FileInputStream(allfiles[i]);
				
				while((ret = readerobj.read(buffer)) != -1)
				{
					writeobj.write(buffer,0,ret);
				}
				readerobj.close();
			}
		}
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
	}
}