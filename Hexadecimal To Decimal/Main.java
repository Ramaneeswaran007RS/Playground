import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    String hex=scan.next();
    int decimal=Integer.parseInt(hex,16);
    System.out.print(decimal);
  }
}