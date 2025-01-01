public class Student {
      String name;
      String surname;
      int age;

    public Student(){

    }
    public Student(int age){
         this.age=age;
    }
    public Student(int age,String name){
         this(age);
         this.name=name;
    }
    public Student(int age,String name,String surname){
         this(age,name);
         this.surname=surname;
    }

    public String surname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String name() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void print(Student sd){
        System.out.println(sd.name);
    }
}
