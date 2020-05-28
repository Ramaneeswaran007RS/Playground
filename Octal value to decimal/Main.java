import java.io.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int octal=s.nextInt();
     int decimal = 0;    
    int n = 0;    
    while(true){    
      if(octal == 0){    
        break;    
      } else {    
          int temp = octal%10;    
          decimal += temp*Math.pow(8, n);    
          octal = octal/10;    
          n++;    
       }    
    }
    System.out.print(decimal);
  }
}