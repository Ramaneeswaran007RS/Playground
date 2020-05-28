import java.util.*;
class Main
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int a[]=new int [n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int m=a[0];
    int in=0;
    for(int i=1;i<n+1;i++)
    { int count =0;
      for(int j=0;j<n;j++)
    {
      if(i==a[j])
     
      { count++;
        in++;}
    }
     if(count==0)
       System.out.print(i);
    }
    
    if(in==n)
      System.out.print(++n);
  }
}