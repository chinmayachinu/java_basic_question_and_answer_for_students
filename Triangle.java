//number triangle
import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,j,m=0;
        for(i=1;i<=n;i++)
        {
			for(j=1;j<=i;j++)
			{
				m++;
                System.out.print(m+" ");
			}
           System.out.println(" ");
        }
    }
}