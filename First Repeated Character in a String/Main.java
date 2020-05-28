import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String a=sc.next();
   int b=a.length();
   char c[]=new char[20];
   char f[]=new char[20];
  for(int i=0;i<b;i++)
  {
   c[i]=a.charAt(i);
    f[i]=a.charAt(i);
  }
   for(int i=0;i<b;i++)
  {
   for(int j=i+1;j<b;j++)
   {
    if(c[i]==c[j])
    {
     c[j]='0';
    }
   }
   }
   int d=b;
  for(int i=0;i<b;i++)
  {
    if(c[i]=='0'&&i<d)
    {
      d=i;
    }
  }
   System.out.print(f[d]);
   }}