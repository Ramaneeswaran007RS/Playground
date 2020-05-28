import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    int i,c=0;
    for(i=0;i<n;i++)
    {
      arr[i]=scan.nextInt();
    }
    int o=scan.nextInt();
     for(i=n-1;i>=0;i--)
    {
       if(arr[i]==o)
       {
         c++;
         break;
       }
     }
    if(c==1)
    {
         System.out.print("second last occurrence index = "+(i-1));
    }
    else
    {
      System.out.print("second last occurrence index = "+(-1));
    }
  }
}
    