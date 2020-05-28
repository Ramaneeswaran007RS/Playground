import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
   Scanner scan=new Scanner(System.in);
   String a=scan.next();
   String b=scan.next();
   char c[]=new char[30];
   char d[]=new char[30];
   int i,j;
   for(i=0;i<a.length();i++)
   {
     c[i]=a.charAt(i);
   }
   for(i=0;i<b.length();i++)
   {
     d[i]=b.charAt(i);
   }
   int count=0;
   for(i=0;i<a.length();i++)
   {
    for(j=i+1;j<a.length();j++)
    {
      if(c[i]==c[j])
      {
        c[i]='0';
      }
    }
   }
   for(i=0;i<b.length();i++)
   {
    for(j=0;j<a.length();j++)
    {
    if(c[j]==d[i])
    {
     count++;
    }
   }
 }
   if(count==b.length())
   {
     System.out.println("Word found in sentence");
   }
   else
   {
      System.out.println("Word not found in sentence");
   }
 }
}