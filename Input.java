import java.lang.*;
import java.util.*;

class Input
{
  public static void main(String a[])
  {
    Scanner sobj=new Scanner(System.in);
    
    System.out.println("Please enter your name");
    String name=sobj.nextLine();

    System.out.println("Please enter your age");
    int Age=sobj.nextInt();

    System.out.println("Please enter your percentage");
    float percentage=sobj.nextFloat();

    System.out.println("Your name is:"+name);
    System.out.println("Your Age is:"+Age);
    System.out.println("Your percentage is:"+percentage);
    sobj.close();
  }
}