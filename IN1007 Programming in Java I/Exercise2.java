import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int current_year, birth_year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        current_year = sc.nextInt();
        System.out.print("Enter the birth year: ");
        birth_year = sc.nextInt();
        int age = current_year - birth_year;
        System.out.println(age);
    }
}
