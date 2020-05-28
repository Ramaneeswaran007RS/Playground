import java.util.Scanner;
class Main
{
 public static void main(String args[]) 
 {
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
   int b[]=new int[a];
   for(int i=0;i<a;i++)
   {
    b[i]=sc.nextInt();
   }
   int c=sc.nextInt();
   int d=sc.nextInt();
   int count=0,t=0;
     for(int i=0;i<a;i++)
   {
     if(c==b[i])
     {
      count++; 
      if(count==d)
      {
        t=i;
      }
     }
   }
   if(t>0)
   {
         System.out.print(t); 
   }
   else
   {
    System.out.print("-1"); 
   }
 }}