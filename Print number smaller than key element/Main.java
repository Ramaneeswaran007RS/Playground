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
    for(i=0;i<n;i++)
    {
      if(arr[i]<o)
      {
        System.out.print(arr[i]+" ");
        c++;
      }
    }
    System.out.println();
    System.out.print(c);
  }
}