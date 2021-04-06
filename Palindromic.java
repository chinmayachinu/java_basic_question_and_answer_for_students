//three digit palindromic number
import java.util.Scanner;
class Palindromic
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("All three digit palindromic digit are ");
         int c=0,i,r =0,d;
         for(i=100;i<1000;i++)
         {
              int num=i;
              while(num!=0)
              {
                 d=num%10;
                 r=r*10+d;
                 num=num/10;
		      }
              if(i==r)
              {
                  System.out.print(r+" ");
                  c++;
              }
              r=0;
          }
          System.out.println("the total number of 3 digit palindromic number="+c);
     }
}

