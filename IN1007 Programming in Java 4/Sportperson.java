public class Sportperson {
    String name;
    String sport;
    int age;

    public Sportperson(String name, String sport) {
        this.name = name;
        this.sport = sport;
        this.age = 31;

    }

    public String toString() {
        return name + " " + sport + age;
    }


    void incrementAge(){
        age++;
    }


}
