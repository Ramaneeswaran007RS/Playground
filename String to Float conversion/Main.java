import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner scan=new Scanner(System.in);
  String a=scan.next();
  String b=a.replaceAll("[a-zA-Z]","");
  float c=Float.parseFloat(b);
  System.out.print(c*2);
 }
}