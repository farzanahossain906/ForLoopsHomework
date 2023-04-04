import java.util.Scanner;

public class FibonacciSiquence {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int n, firstNumber=0, secondNumber=1;

        System.out.println("Enter a number");
        //using scanner to read user input
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        //command ro print expected result
        System.out.println("Fibonacci series till "+n+"terms: ");

        for (int i = 1; i <=n; i++) {
            System.out.println(firstNumber+ ", ");

        //command to compute the next term
        int nextNumber=firstNumber + secondNumber;
        firstNumber=secondNumber;
        secondNumber=nextNumber;
        }
    }
}
