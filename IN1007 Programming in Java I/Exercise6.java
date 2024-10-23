import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();
        if ((c > b) && (b > a)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
