import java.util.Scanner;

public class FactorialNumbers {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int factorial=1;
        //acknowledge user what to enter
        System.out.println("Enter a number");
        //creating scanner to read user input
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for (int i = 1; i <=num ; i++) {
            factorial=factorial*i;
        }
        //command to print expected output
        System.out.println("!" + num+ "="+ factorial);
    }
}
