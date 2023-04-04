import java.util.Scanner;

public class NaturalNumberSum2 {
//declaring variables
    int num, sum=0;
    //creating scanner
    Scanner scanner=new Scanner(System.in);
    public void result(){
        //acknowledge user what to enter
        System.out.println("Enter a number you want to see the sum of natural numbers:  ");
        num= scanner.nextInt();

        for (int i = 1; i <num ; i++) {
            System.out.println(sum+=i);
        }
        //calling method
        System.out.println("Sum of the natural numbers is: "+sum);
    }

    public static void main(String[] args) {
        //creating class object to call non-static area
        NaturalNumberSum2 naturalNumberSum2=new NaturalNumberSum2();
        naturalNumberSum2.result();
    }
}
