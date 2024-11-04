import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();

        int arithmetic_answer = arithmetic(num1, num2);
        int geometric_answer = geometric(num1, num2);
        System.out.println("The arithmetic mean is: " + arithmetic_answer);
        System.out.println("The geometric mean is: " + geometric_answer);

        checker(arithmetic_answer, geometric_answer);
    }

    public static int arithmetic(int num1, int num2){
        return ((num1 + num2) / 2);
    }

    public static int geometric(int num1, int num2){
        return (int) Math.sqrt(num1*num2);
    }

    public static void checker(int arithmetic, int geometric){
        if (arithmetic > geometric){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
