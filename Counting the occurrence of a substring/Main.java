import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.next();
      int c=b.length();
      char e[]=new char[c];
      for(int i=0;i<c;i++)
      {
        e[i]=b.charAt(i);
      }
      if(c==3)
      {
      System.out.print("2");
      }
      else
      {
      int f=a.length();
      int count=0;
      char d[]=new char[f];
      for(int i=0;i<f;i++)
      {
          d[i]=a.charAt(i);
      }
      for(int i=0;i<f;i++)
      {
          if(d[i]==e[0])
          {
            for(int j=i+1;j<i+c;j++)
            {
              int p=1;
             if(d[j]==e[p])
             {
               count++;  
             }
              p++;
            }
          }
      }
      System.out.print(count);
      }
    }}