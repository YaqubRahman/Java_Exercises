import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class AdvancedExercise7 {
    public static void main(String[] args) {
        String user_input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        user_input = sc.nextLine();
        int length = user_input.length();
        int midpoint = (length/2);
        String first_half = user_input.substring(0, midpoint);

        String second_half;

        if (length % 2 == 0){
             second_half = user_input.substring(midpoint,length);
        }
        else{
             second_half = user_input.substring(midpoint+1,length);
        }



        StringBuilder reverse = new StringBuilder();
        reverse.append(first_half);
        reverse.reverse();


        if (reverse.toString().equals(second_half)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
            //System.out.println(reverse);
            //System.out.println(first_half);
            //System.out.println(second_half);
        }
    }
}