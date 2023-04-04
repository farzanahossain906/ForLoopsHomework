import java.util.Scanner;

public class CountNumOfA {
    //main method
    public static void main(String[] args) {
        //declaring variables
        String anything;
        char letter='a';
        int count=0;
        //creating scanner to read user input
        Scanner scanner=new Scanner(System.in);
        //acknowledge user what to enter
        System.out.println("Enter a word or sentence: ");
        anything=scanner.nextLine();

        for (int i = 0; i < anything.length(); i++) {
            if (anything.charAt(i)==letter){
                count++;
            }
        }
        //calling method to print number of 'a'
        System.out.println("The number of 'a' in the string is: "+count);
    }
}
