import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    String n=scan.next();
    String o=scan.next();
    if(n.compareTo(o)==0)
    {
      System.out.print("1");
    }
    else
    {
      System.out.print("0");
    }
  }
}