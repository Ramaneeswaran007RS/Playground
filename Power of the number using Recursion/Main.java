import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int o=scan.nextInt();
    int i,z=n;
    for(i=1;i<o;i++)
    {
      z=z*n;
    }
    System.out.print(z);
  }
}