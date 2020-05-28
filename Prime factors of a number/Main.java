import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner vj=new Scanner(System.in);
  int a=vj.nextInt();
   int b=0,count=1,d=0;
   for(int k=2;k<a;k++)
   {
     if(a%k==0)
     {
       d=d;
       }
       else
       {
        d++;   
       }
   }
     d=d+2;
 if(d!=a)
 {
 for(int i=2;i<a;i++)
  {
   if(a%i==0)
   {
     count=1;
     for(int j=2;j<=i/2;j++)
     {
       if(i%j==0)
       {
        count=0;
         break;
       }
     }
       if(count==1)
       {
           System.out.println(i);
       }
   }
  } 
 }
   else
   {
 System.out.print(d);
   }
 } 
}