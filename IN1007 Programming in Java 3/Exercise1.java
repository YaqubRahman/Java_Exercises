import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user_input = sc.nextInt();

        int result = sequence(user_input);
        System.out.println(result);
    }
    public static int sequence(int n){
        int result = ((4*n) +5);
        return result;
    }



}
