import java.util.Scanner;

public class MultiplicationTable {
    //declaring variables
    int number;
    //creating scanner to read user input
    Scanner scanner=new Scanner(System.in);
    public void multi(){
        //acknowledge user what to enter
        System.out.println("Enter a number to print multiplication table: ");
        number=scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            //calling method to print multiplication table
            System.out.println(number+"X"+i+"="+number*i);
        }
    }

    public static void main(String[] args) {
        //creating class object to call non-static area
        MultiplicationTable multiplicationTable=new MultiplicationTable();
        multiplicationTable.multi();
    }
}
