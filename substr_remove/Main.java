import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner vj=new Scanner(System.in);
  String a=vj.next();
   String b=vj.next();
   int d=a.length();
  char c[]=new char[d];
   int f=b.length();
   char e[]=new char[f];
   for(int i=0;i<d;i++)
   {
    c[i]=a.charAt(i);
   }
   for(int i=0;i<f;i++)
   {
    e[i]=b.charAt(i);
   }
   for(int i=0;i<f;i++)
   {
    for(int j=0;j<d;j++)
    {
      if(e[i]==c[j])
      {
       e[i]='0';
      }
    }
     if(e[i]!='0')
     {
     System.out.print(e[i]);
     }
     }
 }  
}