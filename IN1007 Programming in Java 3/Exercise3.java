import java.util.Scanner;

import static java.lang.Integer.sum;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num = sc.nextInt();
        add(num);

    }

    public static void add(int num) {
        if (num % 2 == 0){
            int result = 0;
            for(int i = 1; i <= num; i++){
                result = i + result;
            }
            System.out.println(result);
        }else{
            System.out.println(0);
        }
    }

}
