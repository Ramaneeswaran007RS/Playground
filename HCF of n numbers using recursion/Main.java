import java.util.*;
class Main
{
public static void main(String arg[])
{
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int  a[]=new int[n];
    for(int i=0;i<n;i++)
    {
a[i]=sc.nextInt();    
    }
     int c=a[0];
     for(int i = 1; i < a.length; i++)
     {
     c= hcf(c, a[i]);
     }    
     System.out.println(c);
  }
}
static int hcf(int a,int b)
  {
    while (b > 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
   }
}