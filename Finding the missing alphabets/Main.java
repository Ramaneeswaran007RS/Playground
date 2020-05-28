import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      char c[]=new char[20];
      for(int i=0;i<a.length();i++)
      {
        c[i]=a.charAt(i);
      }
      int count=0;
      for(int x='a';x<='z';x++)
      {
        count=0;
       for(int i=0;i<a.length();i++)
       {
        if(x!=c[i])
        {
         count++;
        }
       }
        if(count==a.length())
        {
        System.out.print((char)x+" ");
        }
        }
    }
}