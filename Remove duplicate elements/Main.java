import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[20];
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
    for(int j=i+1;j<n;j++)
    {
      if(a[i]==a[j])
      {
        a[j]=0;
      }
    }
   }
    for(int i=0;i<n;i++)
   {
      if(a[i]!=0){
    System.out.print(a[i]+" ");}
   }
 }
}
