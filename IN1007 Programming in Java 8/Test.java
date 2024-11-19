public class Test {
    public static void main(String[] args) {
        Singer Yaqub = new Singer("Yaqub",18,true);

        if(Yaqub.age >= 18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

        System.out.println(Yaqub.name);


        Singer chris = new Singer("Chris",19,true);
        Singer maria = new Singer("Maria",20,true);

        Singer ethan = new Singer("Ethan",26,true);
        Singer tarun = new Singer("Tarun",50,true);

        Duet first = new Duet(chris,maria);

        Duet second = new Duet(ethan,tarun);

        Quatuor firstband = new Quatuor(first,second);

        System.out.println("*********");

        System.out.println(firstband.getDuet2().getSinger1().getAge());

    }
}
