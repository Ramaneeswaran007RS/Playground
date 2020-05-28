import java.io.*;
import java.util.*;
class Main
 {
	public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		char b[]=new char[20];
	    int c=0;
		String d="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<a.length();i++)
		{
  			b[i]=a.charAt(i);
		}
  			c=d.indexOf(b[0]);
  			c=c+26;
  			b[0]=d.charAt(c);
  			for(int i=0;i<a.length();i++)
			{
			 if(b[i]==' ')
			 {
			   c=d.indexOf(b[i+1]);
			   c=c+26;
			   b[i+1]=d.charAt(c);
			   System.out.print(" ");
			 }
		    else
		    {
		     System.out.print(b[i]);
		     }
		   }
	 }
}
    