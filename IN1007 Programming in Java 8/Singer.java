public class Singer {
    String name;
    int age;
    boolean professional = true;

    public Singer( String name, int age, boolean professional) {
        this.age = age;
        this.professional = professional;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getProfessional(){
        return professional;
    }

    public int setAge(int Newage){
        if (Newage >= age){
            this.age = Newage;
        }
        return Newage;
    }

    public boolean reverseProfessional(){
        if (professional){
            this.professional = false;
        } else{
            this.professional = true;
        }
        return professional;
    }

    public boolean isAdult(){
        if (age >= 18){
            return true;
        }else{
            return false;
        }
    }





}


