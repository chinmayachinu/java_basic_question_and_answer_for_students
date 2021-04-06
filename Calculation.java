import java.util.Scanner;
class Calculation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,age,gender and annual income of a person");
        String name=sc.nextLine();
        int age=sc.nextInt();
        double income=sc.nextDouble();
        double tax;
        char gender[]={'M','F'};
        if(income<=250000)
             tax=0;
       	else if(income<=500000)
           	tax=0.1*(income-250000);
        else if(income<=750000)
        	tax=25000+0.2*(income-500000);
        else
        	tax=75000+0.3*(income-750000);
        double netIncome;
    	System.out.println("Name="+name);
    	System.out.println("Annual Income="+income);
    	System.out.println("Tax="+tax);
    	System.out.println("Net income="+(income-tax));
    }
}





