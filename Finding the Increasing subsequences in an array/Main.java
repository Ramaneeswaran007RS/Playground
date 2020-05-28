import java.io.*;
import java.util.*;
class Main
{
public static void main(String arg[])	
{	
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int  a[]=new int[n];
    for(int i=0;i<n;i++)
    {
	a[i]=scan.nextInt();     
    }
     for(int i=0;i<n;i++)
     {
      for(int j=i+1;j<n;j++)
      {
       if(a[i]<a[j])
       {
        System.out.println(a[i]+","+a[j]);
       }
      }
     }
  }
}