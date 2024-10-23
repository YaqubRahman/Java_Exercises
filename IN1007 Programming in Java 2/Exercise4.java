import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        String[] month = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month ");
        String input = sc.next().toUpperCase();


        for(int i = 0; i < month.length; i++){
            if(input.equals(month[i])){
                System.out.println(i+1);
            }
        }
    }
}
