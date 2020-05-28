#include<stdio.h>
void main()
{
 int a;
 int b[20];
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
     scanf("%d",&b[i]);
  } 
  int count[20];
  for(int i=0;i<a;i++)
  {
    count[i]=0;
    for(int j=i+1;j<a;j++)
    {
   if(b[i]==b[j]&&b[i]!=11)
   {
     count[i]++;
     b[j]=11;
   }
    else
    {
     count[i]; 
    }   
  }
    if(b[i]!=11)
    {
    count[i]++;
    }
  }
  for(int i=5;i>=1;i--)
  {
    for(int k=0;k<a;k++)
    {
        if(i==count[k])
    {
     for(int j=i;j>=1;j--)
     {
     printf("%d ",b[k]); 
     }
    }
    }
  }
}