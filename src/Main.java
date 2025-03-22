import Design_Patterns.Abstract_Factory.AbstractFactory;
import Design_Patterns.Abstract_Factory.FactoryProducer;
import Design_Patterns.Factory.Shape;
import Design_Patterns.Factory.ShapeFactory;
import Design_Patterns.Proxy.Image;
import Design_Patterns.Proxy.ProxyImage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    //Month-4

    //Finished

    //Not-Finished

    //region Lesson-25.1,25.2,25.3,25.4
    /*
        1.Enums
        enum also is class
        enum elements are static final and same with the class(enum) type
        enums have methods,constructors
        2. values(),valueOf() method of enum extra ordinal()
        3.UNKNOWN enum element generally carries null
        4.In order to create enum class,we  extend Enum<>
        5.Enums useful for exceptions
        6.C# enums is not rich such as java
        7.Look file notes on FileUtility
        8.Java does not allow classes inside a package to import or access types (classes, enums, interfaces)
         from the default package.
        9.GOF-gang of four,24 essential design patterns
        Singleton Pattern(creational)
        Ensures a class has only one instance and provides a global point of access to it
        10.Effective java book
        11.String immutable
        it is effectively immutable
        12.Config files can implement singleton pattern
        13.Immutable objects best for shared objects(can be implement with final keyword)
        1.they are thread safe
        2.State can not be changed
        3.email delay purpose
        in immutable we do not need synchronized things
        14.Builder pattern(creational)
        Separates the construction of a complex object from its representation
        15.Proxy pattern structural design pattern
        Provides a surrogate or placeholder for another object to control access to it
        16.Factory pattern creational design pattern
        Creates objects without specifying the exact class to create
        17.Abstract Factory creational pattern
        Abstract Factory patterns work around a super-factory which creates other factories.
        This factory is also called as factory of factories.
        18.SOLID Principles
        19.Java dates
        20.Sout gets object if we do not give it char string etc
        then converts it to string
        such as in date
        21.enum revision
     */
    //endregion
    //region Lesson-26.1,26.2,26.3,26.4,26.4,26.5,26.6,26.7
    /*

     */
    //endregion
    //region Lesson-27.1,27.2
    /*

     */
    //endregion
    //region Lesson-28.1,28.2,28.3
    /*

     */
    //endregion
    //region Lesson-29.1,29.2,29.3
    /*

     */
    //endregion
    //region Lesson-30.1,30.2
    /*

     */
    //endregion
    //region Lesson-31.1,31.2,31.3,31.4
    /*

     */
    //endregion
    //region Lesson-32.1,32.2
    /*

     */
    //endregion

//    public static void main(String[] args)  {
//        Actions act=Actions.Delete;
//        ActionsEnum enm=ActionsEnum.DELETE;
//        var values=Numbers.values();
//        for(var item:values){
//            System.out.println(item);
//        }
//        System.out.println(Numbers.valueOf("Positive").text);
//    }
    public static void main(String[] args) throws Exception {
//        FileUtility.writeTextToFile("I am coming for you");
//        FileUtility.writeImageToFile();
//        FileUtility.readTextFile();
//        FileUtility.writeObjectToFile();
//        FileUtility.readObject();
//        SingletonP s= SingletonP.createInstance();
//        Pizza p= new Pizza.PizzaBuilderP()
//                .dough("some")
//                .sauce("some")
//                .topping("some")
//                .build();
//        System.out.println(p);
//        Image image = new ProxyImage("test_10mb.jpg");
//
//        //image will be loaded from disk
//        image.display();
//        System.out.println("");
//
//        //image will not be loaded from disk
//        image.display();
//        Shape shape=new ShapeFactory().getShape("CIRCLE");
//        shape.draw();
//        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
//        //get an object of Shape Rectangle
//        Shape shape1 = shapeFactory.getShape("RECTANGLE");
//        //call draw method of Shape Rectangle
//        shape1.draw();
        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        //get time calculates seconds from 1970
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        //hh-mm-ss we can add this one also
        //his class formats date
        System.out.println(sdf.format(d));//hh 12 hour format HH 24 hour format
        String dt="06-07-2003";
        Date nd=sdf.parse(dt);
        System.out.println(sdf.format(nd));

        //Java 8 Date API
        LocalDate ld=LocalDate.now();
        LocalTime lt=LocalTime.now();
        LocalDateTime ldt=LocalDateTime.of(ld,lt);
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime LDT= LocalDateTime.parse(dt,dtf);
        System.out.println(LDT);
    }
}

