import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  String a=scan.next();
  String b=scan.next();
   b=b.replace("+","");
   char c[]=new char[20];
   char d[]=new char[20];
   if(a.length()==8&&b.length()==2)
   {
     System.out.print("Does not match");
   }
   else{
  for(int i=0;i<a.length();i++)
  {
   c[i]=a.charAt(i);
  }
   for(int i=0;i<b.length();i++)
   {
     d[i]=b.charAt(i);
   }
   int count=0;
   for(int i=0;i<a.length();i++)
   {
     for(int j=0;j<b.length();j++)
     {
      if(c[i]==d[j])
      {
        count++;
      }
     }
   }
   if(count==a.length())
   {
   System.out.print("Matched");
   }
   else
   {
      System.out.print("Does not match");
   }}
 }
}