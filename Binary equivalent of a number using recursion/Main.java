import java.io.*;
import java.util.*;
class Main
{
public static void main(String arg[])
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String c=Integer.toBinaryString(n);
  for(int i=0;i<c.length();i++)
  {
    System.out.print(c.charAt(i)+" ");
  }
}}