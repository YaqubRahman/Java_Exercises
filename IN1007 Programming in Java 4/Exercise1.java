public class Exercise1 {
    public static void main(String[] args) {
        Car myCar = new Car("Ferrari",50,5.2);
        System.out.println(myCar);

        Sportperson Ethan = new Sportperson("Ethan", "Badminton");
        System.out.println("Age before increment: " + Ethan.age);
        Ethan.incrementAge();
        System.out.println("Age after increment: " + Ethan.age);

        //String[] a ={"A", "B", "C", "D"};
        //for (int i=0; i< 4; ++i) {
        //    a[(i+2) % 4] = a[i];
        //}
        //System.out.println(a[0] + a[1] + a[2] + a[3] + "X");




        for (int i = 0; i < 3; ++i) System .out.print((i * 2) % 3);


    }
}
