import java.lang.*;
import java.util.*;

class AgeInvalid extends Exception
{
 public AgeInvalid(String str)
 {
  super(str);
 }
}

class Exception6
{
 public static void main(String arg[])
 {
 
  Scanner sobj=new Scanner(System.in);

  System.out.println("Enter Your Age");
  int Age=sobj.nextInt();
  
  try
  {
   if(Age<18)
   { 
     throw new AgeInvalid("Age is below 18");
   }
  }
  
  catch(AgeInvalid obj)
  {
   System.out.println("Inside catch");
   System.out.println(obj);
  }
 }
}

  
 
 