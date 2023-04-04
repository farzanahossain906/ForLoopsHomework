import java.util.Scanner;

public class DividedBy3and5 {
    //main method
    public static void main(String[] args) {
        //calling method to print
        System.out.println("Numbers divisible by 3: ");
        for (int i = 1; i < 100; i++) {
            //putting condition
            if (i%3==0)
                //calling method to print number divisible by 3
                System.out.println(i+",");
        }
        System.out.println("Numbers divisible by 5: ");
        for (int i = 0; i < 100; i++) {
            //putting condition
            if (i%5==0)
                //calling method to print numbers divisible by 5
                System.out.println(i+",");
        }
    }
}