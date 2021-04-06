//Armstrong number
import java.util.Scanner;
class Armstrong
{
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         int n=sc.nextInt();
         int i,d,c,s=0,num;
         num=n;
         while(n!=0)
         {
             c=0;
             d=n%10;
             c=d*d*d;
             s=s+c;
             n=n/10;
         }
         if(s==num)
             System.out.println("Its a Armstrong number");
         else 
             System.out.println("Not a armstrong number");
     }
}
         