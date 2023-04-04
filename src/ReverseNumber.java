import java.util.Scanner;

public class ReverseNumber {
    //main method
    public static void main(String[] args) {
        //declaring variables
        int reversedNum=0;
        //acknowledge user what to input
        System.out.println("Enter a number you want to reverse: ");
        //creating scanner to read user input
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        for (;num!=0;){
            reversedNum=reversedNum*10;
            reversedNum=reversedNum+num%10;
            num=num/10;
        }
        System.out.println("Reversed number of the input is: "+reversedNum);
    }
}
