import java.util.Scanner;
class Result
{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
     	System.out.println("enter two number");
     	int a=sc.nextInt();
     	int b=sc.nextInt();
     	System.out.println("enter the arithmatic operator");
     	System.out.println("1. *");
  		System.out.println("2. +");
		System.out.println("3. -");
		System.out.println("4. /");
		int ch=sc.nextInt();
        double s;
        switch(ch)
      	{
		  case 1: s=a*b;
		                   System.out.println("the result ="+s);
		           break;
		  case 2: s=a+b;
				        System.out.println("the result ="+s);
		           break;
		  case 3: s=a-b;
			        System.out.println("the result ="+s);
		           break;
		  case 4: s=(double)a/b;
			        System.out.println("the result ="+s);
		           break;
		  default: System.out.println("Invalid choice");
        }

      }
}

