import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner vj=new Scanner(System.in);
  String a=vj.nextLine();
   int d=a.length();
  char c[]=new char[d];
   for(int i=0;i<d;i++)
   {
    c[i]=a.charAt(i);
   }
   for(int i=0;i<d;i++)
   {
    for(int j=i+1;j<d;j++)
    {
      if(c[i]==c[j])
      {
       c[j]='0';
      }
    }
     if(c[i]!='0')
     {
     System.out.print(c[i]);
     }
     }
 }  
}