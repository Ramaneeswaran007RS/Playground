import java.io.*;
import java.util.*;
class Main
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   String a=sc.next();
    String b=sc.next();
    String c=sc.next();
   char d[]=new char[20];
   for(int i=0;i<a.length();i++)
   {
    d[i]=a.charAt(i);
     if(d[i]=='a'||d[i]=='e'||d[i]=='i'||d[i]=='o'||d[i]=='u')
     {
      d[i]='$';
     }
     System.out.print(d[i]);
   }
    char e[]=new char[20];
   for(int i=0;i<b.length();i++)
   {
    e[i]=b.charAt(i);
     if(e[i]!='a'&&e[i]!='e'&&e[i]!='i'&&e[i]!='o'&&e[i]!='u')
     {
      e[i]='#';
     }
     System.out.print(e[i]);
   }
   c=c.toUpperCase();
   System.out.print(c);
}
}