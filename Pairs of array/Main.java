import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    int i,j,a=0;
    for(i=0;i<n;i++)
    {
      arr[i]=scan.nextInt();
    }
    int o=scan.nextInt();
    for (i=0;i<n;i++) 
    {
       for (j=i+1;j<n;j++) 
       {
         if(arr[i]+arr[j]==o)
         {
           System.out.println("("+arr[i]+", "+arr[j]+")");
         }
       }
    }
  }
}
    