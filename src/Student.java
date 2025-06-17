public class Student {
    private String Name;
    private String Surname;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    private int Age;

    public Student(String name, String surname,int age) {
        Name = name;
        Surname = surname;
        Age=age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    @Override
    public String toString() {
        return "Name:"+this.getName()+" Surname:"+this.getSurname()+"Age:"+this.getAge();
    }
}
