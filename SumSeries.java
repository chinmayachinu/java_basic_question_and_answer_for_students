import java.util.Scanner;
class SumSeries
{
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a number");
		 int n=sc.nextInt();
		 double ss=0,s=0,p=1.0,i,j;
		 for(j=2;j<=n;j++)
		 {
			 s=0;
			 p=1;
		     for(i=1;i<=j;i++)
		     {
		     	 s=(s+i);
		    	 p=(p*i);

             }
             ss=ss+(s/p);
	     }
		 System.out.println("the sum series is"+ss);
	}
}


