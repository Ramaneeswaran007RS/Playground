import java.io.*;
import java.util.*;
import java.lang.*;
class Main
{
 public static void main(String args[])
 {
  Scanner vj=new Scanner(System.in);
  String a=vj.nextLine();
   int n=a.length();
  char b[]=new char[n];
   String c="";
   int f=0;
  for(int i=0;i<n;i++)
  {
    b[i]=a.charAt(i);
       c=c+b[i];
    if(b[i]==' '||i==n-1)
    {
     f=c.length();
     for(int k=f-1;k>=0;k--)
     {
       if(c.charAt(k)!=' ')
       {
      System.out.print(c.charAt(k));
     }
     }
      System.out.print(" ");
    c="";
    }
    }
 }
 }