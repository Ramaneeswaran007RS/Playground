import java.io.*;
import java.util.*;
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
     int count=0;
    for(int i=0;i<a;i++)
    {
      count=1;
      for(int j=i+1;j<a;j++)
      {
       if(b[i]==b[j]&&b[i]!=0)
       {
        count++;
         b[j]=0;
       }
        }
      if(b[i]!=0)
        {
        System.out.println(count);
        }
    }
 }
 }