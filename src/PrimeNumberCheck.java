import java.util.Scanner;

public class PrimeNumberCheck {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int count=0;

        //acknowledge user what to enter
        System.out.println("Enter any number: ");
        //creating scanner to take user input
        Scanner scanner=new Scanner(System.in);
       int number=scanner.nextInt();
        for (int i = 1; i <=number ; i++) {
            if (number%i==0){
                count++;
                {
                }
            }
        }if (count==2){
            System.out.println("Prime number.");
        }else {
            System.out.println("Not a prime number.");
        }
        }
    }
