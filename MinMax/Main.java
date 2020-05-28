import java.io.*;
import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int m=a[0];
    for(int i=1;i<n;i++)
      if(m>a[i])
        m=a[i];
    int ma=a[0];
    for(int i=1;i<n;i++)
      if(ma<a[i])
        ma=a[i];
      System.out.println(m+" "+ma);
  }
}