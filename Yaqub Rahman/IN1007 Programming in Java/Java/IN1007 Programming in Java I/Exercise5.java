import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        String name_of_the_TA, name_of_the_student;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of student: ");
        name_of_the_student = input.nextLine();
        System.out.println("Enter name of the TA");
        name_of_the_TA = input.nextLine();
        System.out.println("Dear " + name_of_the_TA +
                "\nI enjoy your tutorials, they are awesome! \n" + name_of_the_student + "." );
    }
}
