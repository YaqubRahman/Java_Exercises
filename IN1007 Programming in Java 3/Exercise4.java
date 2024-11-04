import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        product(n);

    }

    public static void product(int n){
        if (n > 0){
            int answer = 1;
            for (int i = 1; i <= n; i++){
                answer = i * (answer);
            }
            System.out.println(answer);

        } else if (n < 0){
            int answer = -1;
            for (int i = -1; i >= n; i--){
                answer = i * answer;
            }
            System.out.println(answer);
        }else{
            System.out.println(0);
        }
    }
}
