import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner vj=new Scanner(System.in);
  String a=vj.nextLine();
  char b[]=new char[50];
  String c="";
   int d=a.length();
  for(int i=0;i<d;i++)
  {
    b[i]=a.charAt(i);
    c=c+b[i];
    if((b[i]==' '&&b[i-1]=='s')||b[d-1]=='s')
    {
     System.out.println(c);
     c="";
    }
    if(b[i]==' ')
    {
     c="";
    }
  }
 }
 }