//pythagorean triplet
import java.util.Scanner;
class Pythagorean
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter three number a,b,c");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int x,y,z;
       x=a*a;
       y=b*b;
       z=c*c;
       if(x+y-z==0||x==y+z||y==x+z)
             System.out.println(a+" "+b+" "+c+" form a pythagorean triplet");
       else
             System.out.println("they dont form a pythagorean triplet");
     }
 }
