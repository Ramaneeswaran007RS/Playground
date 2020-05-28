import java.util.*;
class Main
{
  public static void main(String [] agrs)
  {
    Scanner scan=new Scanner (System.in);
    String s=scan.nextLine();
    String a=scan.nextLine();
    String b=scan.nextLine();
    s=s.replace(a,b);
    System.out.println(s);
  }
}