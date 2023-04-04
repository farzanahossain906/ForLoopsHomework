import java.util.Scanner;

public class SumOfX {
//declaring variables
    int num, i,sum=0;
    //creating scanner to read user input
    Scanner scanner=new Scanner(System.in);
    public void range() {
        //acknowledge user what to enter
        System.out.println("Enter a number ranging from 1 to 20: ");
        num = scanner.nextInt();
        for (i = 1; i <= num; i++)
            sum+=i;
            if (num <= 20){
            {
                //calling method to print the numbers
                System.out.println(sum+=i);
            }
        }else
            {
                System.out.println("Invalid");
        }
        //calling method to print the sum
        System.out.println("Sum of the numbers is= " + sum);

    }

    public static void main(String[] args) {
        //creating class object to call non-static area
        SumOfX sumOfX=new SumOfX();
        sumOfX.range();
    }
    }