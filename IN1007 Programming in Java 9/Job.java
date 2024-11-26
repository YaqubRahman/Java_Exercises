public class Job {
    public String name;
    public int wage;

    //Constructor

    public Job(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    //Getter and Setters

    public String getName(){
        return name;
    }
    public int getWage(){
        return wage;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWage(int wage){
        this.wage = wage;
    }


}
