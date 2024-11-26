import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);

        System.out.println(circle.getTotalSurface());
        System.out.println(circle1.getTotalSurface());
        System.out.println(circle2.getTotalSurface());
        //************************************************//

        Job manager = new Job("manager",3000);
        Company mycompany = new Company("mycompany",0,new Employee[0]);
        Employee yaqub = new Employee("Yaqub",manager,mycompany);


        Employee[] myarray = new Employee[5];

        System.out.println((Arrays.toString(yaqub.addEmployee(yaqub, myarray))));

        for(int i = myarray.length-1; i > 0 ; i--){
            if (myarray[i] == null){
                break;
            } else {
                System.out.println(myarray[i].getJob().getWage());
            }


        }




    }


}
