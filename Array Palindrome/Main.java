import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int arr[]=new int[n];
    int i,j,a=1;
    for(i=0;i<n;i++)
    {
      arr[i]=scan.nextInt();
    }
    if(arr[0]==arr[n-1]&&arr[1]==arr[n-2])
    {
      System.out.print("Yes");
    }
    else
    {
      System.out.print("No");
    }
  }
}