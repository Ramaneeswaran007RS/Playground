import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int sum=0,gum=0,a,b;
    while(n!=0)
    {
      a=n%10;
      sum=sum+a;
      n=n/10;
    }
    if((sum/10)>=1)
    {
      while(sum!=0)
      {
        b=sum%10;
        gum=gum+b;
        sum=sum/10;
      }
    System.out.print(gum);
    }
    else
    {
      System.out.print(sum);
    }
  }
}




