import java.lang.*;
import java.util.*;

class Student
{
	public int RID;
	public String Name;
	public int Salary;
	
	private static int Generator;
	
	static
	{
		Generator = 0;
	}
	
	public Student(String str,int value)
	{
		this.RID = ++Generator;
		this.Name = str;
		this.Salary = value;
	}
	
	public void DisplayData()
	{
		System.out.println(this.RID+"\t"+this.Name+"\t"+this.Salary);
	}
}

class DBMS
{
	public LinkedList<Student> lobj; 
	
	public DBMS()
	{
		lobj = new LinkedList<>();
	}
	
	public void StartDBMS()
	{
		System.out.println("Marvellous customised DBMS startred succesfully....");
		
	}
}

class program361
{
	public static void main(String arg[])
	{
		DBMS dobj = new DBMS();
		dobj.StartDBMS();
	}
}