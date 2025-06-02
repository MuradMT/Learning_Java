import Annotations.Test;
import Design_Patterns.Abstract_Factory.AbstractFactory;
import Design_Patterns.Abstract_Factory.FactoryProducer;
import Design_Patterns.Factory.Shape;
import Design_Patterns.Factory.ShapeFactory;
import Design_Patterns.Proxy.Image;
import Design_Patterns.Proxy.ProxyImage;
import Threads_File_Practise.FileWriter;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    //Month-4

    //Finished

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
         1.Moving to files
         2.mkyong.com is good java source
         3.FileOutputStream read and write,BufferedReader and BufferedWriter
         4.git revision
         5.Annotation is special type of interface
         such as @Override comes from @interface
         6.Lombok is a Java library that helps reduce boilerplate code
         by automatically generating repetitive code such as
         getters, setters, constructors, equals(), hashCode(), toString(),
         and more through simple annotations.
         examples:@Getter @Setter @ToString
         @NoArgsConstructor @AllArgsConstructor etc
         7.Marketplace->lombok,enable annotation processors
         8.Reflections suggested to use only for ides,not for your personal projects
         9.Git extra commands revision
         10.TortoiseGit is a free, open-source Git client for Windows
         that provides a graphical user interface (GUI)
          for interacting with Git repositories.
          It integrates seamlessly with the Windows File Explorer,
          making it very convenient for developers
          who prefer a more visual approach to managing their Git workflows
          rather than using the command line.
          no mac support
          11.We can assign tasks with issues section in group project
          manage with projects sections
          teams,projects,repositories,kanban
          12.Production(master) development(releases-tasks) branches
          13.git fetch is a Git command used to download changes from a remote repository
          to your local repository without merging them into your local codebase.
     */
    //endregion


    //region Lesson-27.1,27.2
    /*
        1.Thread implements runnable and has method run
        2.Parallel programming is about executing multiple tasks truly simultaneously by dividing the work across multiple CPU cores.
        3.Concurrency is about dealing with multiple tasks at the same time by switching between them (multitasking).
        4.Runnable acts as tasks
        5.The ExecutorService in Java is part of the java.util.concurrent package
        and is designed to manage and control a pool of threads for executing asynchronous tasks.
        It provides a higher-level replacement for creating and managing threads manually.
        6.If you want to create MyThread(own class)
        1.implement runnable->only access to run ,to start method of thread,
        just create Thread class instance and use its start method
        2.extend thread->access all features of thread class and directly use it
        7.extend vs implements->extend is expensive operation,so always prefer implements

             */

    //endregion
    //region Lesson-28.1,28.2,28.3
    /*

        8.Race condition-two tasks works in multiple threads and updates things wrong
        9.Volatile,synchronized
        10.AtomicInteger works with native c++,so it performs fast
        10.Thread Safe->with volatile+synchronized or AtomicInteger helps us
        to ensure safety of threads
        11.In Java, a monitor lock (or intrinsic lock) is a synchronization mechanism
         that allows only one thread at a time to execute a block of code or a method
          that is marked as synchronized.
         Every object in Java has an associated monitor lock.
          Synchronized block with custom lock object:
         private final Object lock = new Object();

         public void myMethod() {
           synchronized (lock) {-locks method
        // critical section
       }
       }
       synchronized(this)-locks object
       synchronized(Some.class)-locks class
       12.A deadlock occurs when two or more threads are blocked forever,
       each waiting for the other to release a lock.

        ⸻

        How does it happen?

        A typical scenario:
            1.	Thread 1 acquires Lock A and waits for Lock B.
            2.	Thread 2 acquires Lock B and waits for Lock A.
         13.avoid deadlock->avoid nested or unnecessary locks
         14.Method
        Who uses it?
        What it does
        join()
        Thread
        Waits for another thread to finish.
        Helps as to synchronously process threads,not asynchronously
        wait()
        Thread
        Waits & releases lock on an object.
        notify()
        Thread
        Wakes up one waiting thread.
        15.ReentrantLock is lock mechanism such as monitor,
        but reentrant lock allows us to use lock and unlock methods
        16.Thread.sleep()-waits a few seconds thread,1000 ms is 1 second
     */
    //endregion

    //Not-Finished

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
    private volatile static int num=0;
    //volatile helps us to create singularity,
    //every core gets value from central position
    //The volatile keyword in Java is used to indicate
    //that a variable’s value may be changed by multiple threads,
    //update guarantee,atomicity not guarantee

    public synchronized static void increase(){
        num++;
    }

    public static AtomicInteger ai=new AtomicInteger();
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
//        Date d=new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        //get time calculates seconds from 1970
//        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//        //hh-mm-ss we can add this one also
//        //his class formats date
//        System.out.println(sdf.format(d));//hh 12 hour format HH 24 hour format
//        String dt="06-07-2003";
//        Date nd=sdf.parse(dt);
//        System.out.println(sdf.format(nd));
//
//        //Java 8 Date API
//        LocalDate ld=LocalDate.now();
//        LocalTime lt=LocalTime.now();
//        LocalDateTime ldt=LocalDateTime.of(ld,lt);
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDateTime LDT= LocalDateTime.parse(dt,dtf);
//        System.out.println(LDT);
//        Test test=new Test();
//        test.setName("murad");
//        System.out.println(test.getName());
        //System.out.println(System.currentTimeMillis());
        //System.out.println(System.nanoTime());
//        System.out.println("before:"+Thread.activeCount());
//        Runnable runnable1=new Runnable(){
//            @Override
//            public void run() {
//                for(int i=0;i<100;i++){
//                    //num++; simple increase creates race condition
//                    //increase();
//                    ai.incrementAndGet();
//                }
//            }
//        };
//        Runnable runnable2=new Runnable(){
//            @Override
//            public void run() {
//                for(int i=0;i<100;i++){
//                    //num++;
//                    //increase();
//                    ai.incrementAndGet();
//                }
//            }
//        };
//        Thread thread1=new Thread(runnable1);
//        Thread thread2=new Thread(runnable2);
//
//        thread1.start();
//        thread2.start();
        // Executer service helps us to do thread creating automatically


        //ExecutorService excs= Executors.newSingleThreadExecutor();
//        ExecutorService excs=Executors.newFixedThreadPool(2); //creates fixed thread pool
//        excs.submit(runnable1);
//        excs.submit(runnable2);
//
//        excs.shutdown();
//        excs.awaitTermination(1, TimeUnit.DAYS);
//
//        System.out.println("after:"+Thread.activeCount());
//        System.out.println(System.nanoTime());
        FileWriter fw1=new FileWriter("Salam","myfile.txt", FileWriter.Write_Type.IO,100);
        FileWriter fw2=new FileWriter("Salam1","myfile.txt", FileWriter.Write_Type.NIO,100);
        ExecutorService exc=Executors.newFixedThreadPool(2);
        exc.submit(fw1);
        exc.submit(fw2);
        exc.shutdown();
        exc.awaitTermination(1,TimeUnit.MINUTES);
    }
}

