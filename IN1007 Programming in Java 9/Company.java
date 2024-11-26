public class Company {
    public String name;
    public int numberOfEmployees = 0;
    public Employee[] listOfEmployees;

    //Constructor

    public Company(String name, int numberOfEmployees, Employee[] listOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.listOfEmployees = listOfEmployees;
    }


    //Getter and Setters

    public String getName(){
        return name;
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public Employee[] getListOfEmployees(){
        return listOfEmployees;
    }
    public void setListOfEmployees(Employee[] listOfEmployees){
        this.listOfEmployees = listOfEmployees;
    }

}
