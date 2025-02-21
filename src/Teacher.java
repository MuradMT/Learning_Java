public class Teacher {
    private String name;
    private String surname;
    private int age;
    private double salary;

    public static final String NAME="name";
    public static final String SURNAME="surname";
    public static final String AGE="age";
    public static final String SALARY="SALARY";
    public Teacher(){

    }

    public Teacher(String name,String surname,int age,double salary){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.salary=salary;
    }

    public String name() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String surname() {
        return surname;
    }

    public Teacher setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public int age() {
        return age;
    }

    public Teacher setAge(int age) {
        this.age = age;
        return this;
    }

    public double salary() {
        return salary;
    }

    public Teacher setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
