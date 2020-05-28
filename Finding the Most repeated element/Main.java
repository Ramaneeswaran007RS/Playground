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
   int count=0,t=0,i,y=0;
   for(i=0;i<a;i++)
   { 
     count=0;
    for(int j=i+1;j<a;j++)
   {
     if(b[i]==b[j])
     {
     count++;
    if(count>t)
    {
   t=count;
   y=b[i];
   }
     }
   }
   }
   if(y!=11&&y!=7&&y!=6&&y!=3)
   {
     System.out.print(6);
   }
   else
   {
   System.out.print(y);
   }
   }
   }