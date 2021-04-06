//convert c-f and f-c
import java.util.Scanner;
class Temp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user choice");
        System.out.println("1. F-C");
        System.out.println("2. C-F");
        int choice=sc.nextInt();
        switch (choice)
        {
           case 1: System.out.println("enter degree farenheit");
                   double f=sc.nextDouble();
                   double c;
                   c=(f-32)*0.5556;
                   System.out.println(f+"is converted into C="+c);
                   break;
           case 2: System.out.println("enter degree celcius");
                   double cl=sc.nextDouble();
                   double fr;
                   fr=(cl*1.8)+32;
                   System.out.println(cl+"is converted into F"+fr);
                   break;
          default: System.out.println("invalid choice");
        }
     }
 }