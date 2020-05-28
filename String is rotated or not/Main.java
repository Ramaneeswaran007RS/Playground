import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      a=a+a;
      String b=sc.next();
      if(a.contains(b))
      {
        System.out.print("Rotated");
      }
      else
      {
        System.out.print("Not rotated");
      }
    }}