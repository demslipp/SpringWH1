package Task1.Bean;

public class Employee{

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

    @Override
    public String toString(){
        return "Employee{"+
                "surname='"+surname+'\''+
                ", name='"+name+'\''+
                ", middlename='"+middlename+'\''+
                ", age="+age+
                ", salary="+salary+
                ", email='"+email+'\''+
                ", job='"+job+'\''+
                '}';
    }
}
