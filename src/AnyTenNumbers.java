import java.util.Scanner;

public class AnyTenNumbers {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int num1;
        int num2;
        //creating scanner to take user input
        Scanner scanner= new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Enter first number of range: ");
        num1=scanner.nextInt();
        System.out.println("Enter last number of range:");

        num2=scanner.nextInt();


        for (int i=num1; i<=num2; i++){

            System.out.println(i);
        }


    }
}
