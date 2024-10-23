import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 9;


        while (num1 % 2 != 0) {
            System.out.println("Enter first number");
            num1 = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i <= num1; i++) {
            System.out.println(i + "+");
            total = total + i;
        }

        System.out.println("= " + total);
    }
}
