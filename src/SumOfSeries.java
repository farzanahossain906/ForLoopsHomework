import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args)
    {
        //creating scanner
        Scanner scanner=new Scanner(System.in);
        //declaring variable
        double result=0,number,i;
        //calling method to print what user should enter
        System.out.println("Please Enter the value of N: ");
        number=scanner.nextInt();
        for(i=1;i<=number;i++)
        {
            result=result+(1/i);
            //putting conditions
            if(i==1)
                System.out.print("1 + ");
            else if(i==number)
                System.out.print("1/ "+i);
            else
                System.out.print("1/ "+i+"; +; ");
        }
        System.out.println();
        System.out.println("The sum of the series is= "+result);
    }
}
