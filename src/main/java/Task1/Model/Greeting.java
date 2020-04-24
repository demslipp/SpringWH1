package Task1.Model;

public class Greeting{

    private String surname;
    private String name;
    private String middlename;
    private short age;
    private int salary;
    private String email;
    private String job;

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getMiddlename(){
        return middlename;
    }

    public void setMiddlename(String middlename){
        this.middlename=middlename;
    }

    public short getAge(){
        return age;
    }

    public void setAge(short age){
        this.age=age;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job=job;
    }
}

