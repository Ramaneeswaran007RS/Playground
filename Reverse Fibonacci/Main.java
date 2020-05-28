import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[]) 
 {
  Scanner scan=new Scanner(System.in);
  int a=scan.nextInt();
   int d=0,s=1,l,g=0;
   int b[]=new int[20];
  for(int i=2;i<a;i++)
  {
    l=s;
    s=d+s;
    d=l;
    b[i]=s;
    g++;
  }
   for(int i=g+1;i>1;i--)
   {
    System.out.print(b[i]+" "); 
   }
   if(a>1)
   {
   System.out.print("1 ");
   }
   System.out.print("0 ");
 }
}