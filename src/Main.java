import java.sql.SQLOutput;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class Main {
    //Month-3

    //Finished

    //region Lesson-17.1,17.2
    /*
        1.StringBuilder is asynchronized
        StringBuffer is synchronized
        String builder is fast
        2.Race condition(asynchronous threads enter)
        3.Thread safe-String buffer
        Optimize string pool,but at the end we do not enter string pool
        4.compare,toString,parseInt,max,min methods of Integer class
        5.compareTo String method
        6.Signed vs Unsigned int
        7.parseBoolean returns true only true
        8.Math class methods max,min,
        ceil,floor,round,abs,pow,
        random,sqrt
        9.Recursion(factorial)
    */
    //endregion
    //region Lesson-18.1,18.2
    /*
    1.Build process steps
    Open Module Settings
    Artifacts
    extract to the target jar
    build artifact
    rebuild-clean+build
    clean deletes jar file
    2.zip,rar archive unarchive
    3.java -jar lesson1.jar - runs jar file
    4.Manifest mf file shows main class name
    5.Ant,Maven,Gradle are build tools
    Added to intellij,And configuration tasks
    Ant build.xml  we create bin.dir inside init target
    src bi  lib properties
    6.yaml,xml file structures
    7.inside java.lang all classes
     can be used without import such as System,String
    8.We can add our project(jar version of project)
    to the external libraries and then use classes inside it
    on different project,jvm sees all libraries
    We need to add external jar to out artifacts folder
    Then to add classpath to the manifest file
    9.Jdk for java,jdk is a sdk for java,SDK for all languages
    sdk includes tools to compile develop run code
    10.Library is a collection of pre-written code you can use in your project
    11.(Ant,Maven,Gradle difference)Ant can not find libraries,modify life cycle,uses xml
    Maven can find libraries,but can not modify life cycle,uses xml
    Gradle does both,uses groovy language
    can modify files and download libraries
    12.We can find jars on internet
    13.Jvm languages android sdk scala etc
    14.Files with same name inside project folder>>> external library same name file
    15.(state vs behaviour) Object methods-behaviours
    object fields-states
    16. static { } - block belongs to class
    {}-block belongs to object
    blocks > constructor ,no practical use
    17.Class.forName calls class directly
    18.extends inheritance ,method overload
     */
    //endregion
    //region Lesson-19.1,19.2
    /*
    1.No multiple extends,creates diamond problem
    2.Child class overrides parent class function
    3.Student s=new Student();
          Person p=s upcasting process
          OR new Student();
    we get only things inside person class in this syntax,
    nothing from student,SOLID L
    4.Student s=(Student)p; if person is new Student()
    Down casting process
    Polymorphism also,happens in run time
    5.Object is default inherited class,every class inherits it
    has 4 methods hasCode,equals,toString,getClass
    6.instanceOf keyword
    Student s=new Student();
          boolean res=s instanceof Person;
     7.If class extends something,then
     we have is a relationship example
     Student is a Person
     But if a class inside the class,
     then we have has a relationship
     Student has a university
     it is also composition(University is separate class)
     8.Java Hidden Variable (Variable Shadowing)
     In Java, a hidden variable refers to a situation where a local variable,
     method parameter, or subclass variable hides an instance variable (field) of the class or superclass.
     This is also known as variable shadowing.
    class Parent {
        int value = 10; // Instance variable (hidden in the subclass)
    }

    class Child extends Parent {
        int value = 20; // Hides the parent class's 'value' variable

        void display() {
            System.out.println("Child value: " + value); // Refers to the child's 'value'
            System.out.println("Parent value: " + super.value); // Refers to the parent's 'value'
        }
    }

    public class HiddenVariableExample {
        public static void main(String[] args) {
            Child obj = new Child();
            obj.display();
        }
    }
    9.private public protected default(package-private) access modifiers
    protected also acts as internal c# keyword,
    if you are inside same package,you can see protected variable in different classes
    java protected same with c# protected internal
    java default access modifier acts as c# internal
    10.Parent class stronger than child,
    in child you can not modify access modifier to weak one
    for instance public to default
    11.@Override-this is annotation
    Helps us to minimize error and ensure 100% overriding
    12.Final keyword-it acts both c# const and readonly at the same time
    you can use it as const and readonly
    public static final int MY_VARIABLE=5; -it is convention if final acts as const
    final variable must be Capitalized and use _
     */
    //endregion
    //region Lesson-20.1,20.2
    /*
    1.super keyword
    2.super keyword are included in non
    parameter child class constructor
    public Student(){
        //super()-this happens always,even you do not write explicitly
    }
    3.We can call super at the end of constructor chain
    this and super can not be used at the same time
    4.Override toString
    5.null can not be used directly
    System.out.println(null);
    6.Override equals
     */
    //endregion
    //region Lesson-21.1,21.2
    /*
    1.Creation of console app
     */
    //endregion
    //region Lesson-22.1,22.2
    /*
       1.Console app revision(some folder structure demonstration)
       2.Abstraction,abstract class rules
       3.(unnamed class) Abstract class does not create object,
       but creates the instance of unnamed class
        University university=new University() {
            @Override
            public void print() {

            }
        };
       4.No multi inheritance (diamond problem)
       5.java has final keyword for classes,
       and sealed+permits keywords
       that are same with c# sealed
       6.class A{class B static class C}
       A.B abinstance=new A().new B(); -inner class
       A.C acinstance=new A().C(); - nested class
       7.Class.forName("") loads class dynamically
       public static void main(String[] args) throws ClassNotFoundException {

        Class<?> cname=Class.forName("Teacher");
        System.out.println(cname);

        }
     */
    //endregion
    //region Lesson-23.1,23.2
    /*
       1.public abstract hidden in interfaces
       2.In java we extend abstract or concrete class
       but implement interfaces
       3.In c# we name interfaces like IService,
       in java ServiceInterface or ServiceI or simply Service
       4.extends keyword can be used for 1 class
       implements keyword can be used with multiple interfaces
       5.extends and implements can be used at the same time
       6.public static final hidden in interface variables
       7.Interfaces extends each other
       8.extends is expensive operation,only use in essential cases
       9.Marker interface-acts as marks,
       for instance IEntity is marker interface
       in java Cloneable,Serializable are examples
       10.default keyword in interface methods allows us to
       add method body in class
       11.In 2 interfaces with same default methods, we need override method
       12.backward compatibility
       java 8 codes will work on java 24
     */
    //endregion

    //Not-Finished

    //region Lesson-24.1,24.2,24.3
    /*
       1.Exception vs error
       2.Try catch finally
       try{

        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
        finally {
            System.out.println("HI");
        }
       3.throw keyword
       throw new MyException("Hi");
       4.Throwable class is base of Exception class,
       custom exceptions should extend Exception or Throwable
        public class MyException extends Exception(or you can use Throwable) {
        public MyException(String message){
            super(message);
        }

        }
        5.printSStackTrace-prints all reds
        6.multiple exceptions in 1 catch block
        try{

          }catch(NullPointerException | MissingFormatArgumentException ex){
              System.out.println();
          }
         7.Error class also extends throwable class
         We generally use exception class,
         error class represents system errors
         Throwable -> Exception and Error
         try
         {

         }catch(Error er){

         }
         8.Runtime vs compile time exceptions
         9.Java helps us to get exception directly
         try{

          }
          catch(Exception ex){
              throw new MyThrowable("Help",ex);
          }
              public class MyThrowable extends Throwable{
        public MyThrowable(String message,Throwable t){
            super(message,t);
        }
        10.throws keyword marking the possible exceptions(Not RuntimeExceptions) of the function
        also helps us to force programmer to catch the method
        that used throws keyword
        public static void main(String[] args) throws MyException {
             throw new MyException("hi");
         }

        }
        11.RuntimeException gives us freedom of choice we catch or not exception,
        we do not need to use throws keyword
        12.Checked exceptions- classes inherited from Exception or throwable classes
        Unchecked exceptions- classes inherited from RuntimeException
        13.alternative version to throw keyword
            public static void main(String[] args)  {
                 try{
                     print();
                 }catch (Exception ex){
                     throw new RuntimeException(ex);
                 }
        }
         public static void print() throws MyException{

         }
        14.multiple throws
     */
    //endregion

//    public static void main(String[] args) throws ClassNotFoundException {
////         StringBuffer sb=new StringBuffer(60); //char array keeps inside
////         for(int i=0;i<10;i++){
////             sb.append("java");
////         }
////        System.out.println(sb.toString());
////         var s=Integer.toString(3);
////         var res=Integer.compare(12,13);
////        System.out.println("murad".compareTo("mur"));
////        System.out.println(res);
////        int a=Math.abs(-30);
////        System.out.println(Math.random());
////        System.out.println(factorial(3));
//        Class.forName("Student");
//    }
////    public static void recursion(){
////        recursion();
////    }
////    public static int factorial(int a){
////        if(a<0) return 0;
////        if(a<2) return 1;
////        return factorial(a-1)*a;
////    }
//    public static void main(String[] args) {
//        Person s = new Student("murad",21);
//        Person ss = new Student("murad",21);
//        System.out.println(s.equals(ss));
//        System.out.println(s==ss);
//
//    }
//    public static void main(String[] args) {
//
//        System.out.println("Enter the number of teachers:");
//        int count=Integer.parseInt(new Scanner(System.in).next());
//
//        Teacher[] tca=new Teacher[count];
//
//        for(int i=0;i<count;i++){
//            System.out.println("Teacher number:"+(i+1));
//            tca[i]=requireandCreate();
//        }
//
//
//        System.out.println("Select operation:");
//        System.out.println("1.create \n 2. update \n 3. delete \n 4.search \n 5.see all");
//        int action=new Scanner(System.in).nextInt();
//        if(action==1){
//            create(tca);
//        }
//        else if(action==2){
//            update(tca);
//        } else if (action==3) {
//            delete(tca);
//        }
//        else if(action==4){
//            search(tca);
//        }
//        else  if(action==5){
//            printAll(tca);
//        }
//    }
//
//    public static void delete(Teacher[] tca){
//        System.out.println("Select the number of teacher:");
//        int delT=new Scanner(System.in).nextInt();
//        tca[delT-1]=null;
//    }
//    public static Teacher requireandCreate(){
//        System.out.println("Enter the details of teacher:");
//
//        Teacher teacher=new Teacher(
//                new Scanner(System.in).nextLine(),
//                new Scanner(System.in).nextLine(),
//                new Scanner(System.in).nextInt(),
//                new Scanner(System.in).nextDouble());
//        return teacher;
//    }
//    public static void printAll(Teacher[] tca){
//        System.out.println("Registered teachers:");
//        for(int i=0;i<tca.length;i++){
//            System.out.println((i+1)+" "+tca[i]);
//        }
//    }
//    public static void update(Teacher[] tca){
//        System.out.println("Enter the number of teacher:");
//        int num=new Scanner(System.in).nextInt();
//        var teacher=tca[num];
//        System.out.println("Which field do yo want to update?");
//        String text=new Scanner(System.in).nextLine();
//        if(text.equals(Teacher.NAME)){
//            System.out.println("Enter name:");
//            String name=new Scanner(System.in).nextLine();
//            teacher.setName(name);
//        }
//        else if(text.equals(Teacher.SURNAME)){
//            System.out.println("Enter surname:");
//            String surname=new Scanner(System.in).nextLine();
//            teacher.setSurname(surname);
//        }
//        else if(text.equals(Teacher.AGE)){
//            System.out.println("Enter age:");
//            int age=new Scanner(System.in).nextInt();
//            teacher.setAge(age);
//        }
//        else if(text.equals(Teacher.SALARY)){
//            System.out.println("Enter salary:");
//            double salary=new Scanner(System.in).nextDouble();
//            teacher.setSalary(salary);
//        }
//    }
//    public static void create(Teacher[] tca){
//        System.out.println("Enter teachers:");
//        int addCount=new Scanner(System.in).nextInt();
//        Teacher[] ntca=new Teacher[tca.length+addCount];
//        for(int i=0;i<tca.length;i++){
//            ntca[i]=tca[i];
//        }
//        for(int i=tca.length;i<ntca.length;i++){
//            ntca[i]=requireandCreate();
//        }
//        tca=ntca;
//    }
//    public static void search(Teacher[] tca){
//        System.out.println("Enter the name or surname of teacher");
//        String text=new Scanner(System.in).nextLine();
//        for(int i=0;i<tca.length;i++){
//            if(tca[i].name().equals(text) || tca[i].surname().equals(text)){
//                System.out.println(tca[i]);
//            }
//        }
//    }
//}
    public static void main(String[] args)  {

    }

}
