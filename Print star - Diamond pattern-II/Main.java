import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int c=1;
    int z=0;
    for(int i=1;i<=a;i++)
    {
   for(int j=a-1;j>=i;j--)
     {
    System.out.print(" ");
      }
      for(int k=c;k>=i;k--)
      {
      System.out.print("*");
      }
      z=c;
      c=c+3;
     
   
      System.out.println();
    }
   
   int s=z-a-1;
     for(int i=1;i<=a;i++)
    {
   for(int j=1;j<=i;j++)
     {
    System.out.print(" ");
      }
      for(int k=s;k>=i;k--)
      {
      System.out.print("*");
      }
       s=s-1;
      System.out.println();
    }
  }
}