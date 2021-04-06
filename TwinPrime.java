//Twinprime no from 1 to any number
import java.util.Scanner;
class TwinPrime
{
   public static void main(String args[])
     {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,c=0,d=1;
       for(j=1;j<=n;j++)
        {
             c=0;
             for(i=1;i<=j;i++)
             {
                if(j%i==0)
                c++;
             }
            if(c==2)
            {

               if(j-d==2)

				  System.out.println("twinprime no are="+j+" and "+d);

		       d=j;
		    }

	     }
     }
}
