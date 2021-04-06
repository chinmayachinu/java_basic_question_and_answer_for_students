//swapping three number
import java.util.Scanner;
class Swap3
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter three numbers");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int t;
       t=b;
       b=c;
       c=a;
       a=t;
       System.out.println("after swapping the three numbers are a="+a+" b="+b+" c="+c);
    }
}