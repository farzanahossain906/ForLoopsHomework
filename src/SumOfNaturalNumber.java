import java.util.Scanner;

public class SumOfNaturalNumber {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int num;
        int sum=0;
        int i;
        //creating scanner to read user input
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number:");
        num=scanner.nextInt();

        //check if the conditions are true
        for ( i=1; i <=num; i++) {
            //calling method to print the numbers
            System.out.println(sum+=i);
        }
        //calling method to print the sum
        System.out.println("Sum of the natural numbers is= "+sum);
    }


}
