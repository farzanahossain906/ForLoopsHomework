import java.util.Scanner;

public class Calculator {
    //main method
    public static void main(String[] args) {
        //declaring variables
        char operator;
        int num1, num2, result;
        double resultD;
        //creating object for scanner class
        Scanner scanner=new Scanner(System.in);

        //ask user what to enter
        System.out.println("Enter first number: ");
        num1=scanner.nextInt();

        System.out.println("Enter second number: ");
        num2= scanner.nextInt();

        System.out.println("Enter an operand you want to use(+,-,*,/)");
        operator=scanner.next().charAt(0);

               //addition of the numbers
        switch (operator){
            case '+':
                result=num1+num2;
                System.out.println(num1+"+"+num2+"="+result);
                break;
                //subtraction of the numbers
            case '-':
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
                //multiplication of the numbers
            case '*':
                result=num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
                //division of the numbers
            case '/':
                resultD=num1/num2;
                System.out.println(num1+"/"+num2+"="+resultD);
                break;
            default: {
                System.out.println("Invalid entry.");
            }
        }

    }
}
