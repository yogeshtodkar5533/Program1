import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
	public Frame fobj;
	
	public MarvellousFrame(String name)
	{
		Frame fobj=new Frame(name);
		fobj.setSize(600,600);
		fobj.setVisible(true);
	}
}

class FrameDemo2
{
	public static void main(String arg[])
	{
		System.out.println("print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
	}
}