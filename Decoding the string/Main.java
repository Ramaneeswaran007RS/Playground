import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b="abcdefghijklmnopqrstuvwxyz";
      int c=sc.nextInt();
      char d[]=new char[100];
      int e=0;char f='r';
      int h=a.length();
      a=a.toLowerCase();
      for(int i=0;i<h;i++)
      {
        d[i]=a.charAt(i);
        //System.out.print(d[i]);
        if(d[i]!=' ')
        {
          f=d[i];
          e=b.lastIndexOf(d[i]);
          e=e-c;
          if(e<0)
          {
           e=e+26;
          }
          d[i]=b.charAt(e);
        }
       }
      int r=0;
      String u="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRTUVWXYZ";
      r=u.indexOf(d[0]);
      r=r+26;
      d[0]=u.charAt(r);
      for(int i=0;i<a.length();i++)
      {
       System.out.print(d[i]);
      }
    }
}