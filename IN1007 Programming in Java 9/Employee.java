public class Employee {
    public String name;
    public Job job;
    public Company company;

    //Constructor

    public Employee(String name, Job job, Company company) {
        this.name = name;
        this.job = job;
        this.company = company;
        this.company.numberOfEmployees++;
    }

    //Getter and Setters

    public String getName(){
        return name;
    }
    public Job getJob(){
        return job;
    }
    public Company getCompany(){
        return company;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setJob(Job job){
        this.job = job;
    }
    public void setCompany(Company company){
        this.company = company;
    }

    public Employee[] addEmployee(Employee e, Employee[] t){
        int length = t.length;
        t[length-1] = e;
        return t;
    }


}
