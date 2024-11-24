import test.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //region Java Topics  Month-1
        //Intro.Everything is Object as C# in Java
        //Intellij ,IDE Concept.
        //Java Byte Code<->Operating System<->CPU
        //Debugger,Step over ,Step into,Step out
        //Arithmetic %,Relational >=,Logical ||,assignment += operators
        //ASCII Table,UTF8 Encoding system,long int max capacity
        //1.Comments,variables(RAM Allocation),data types(primitive vs non primitive),
        // type casting(downcasting,upcasting),scope//narrowing,widening in primitive types
        //2.Scanner(scanner close,next nextLine)
        //var number=new Scanner(System.in).nextInt();//shortcut of getting input with Scanner
        // and println(sout,psvm shortcuts),print,escape symbols \n ,concatenation +
        //3.String,string methods(isEmpty,split,replace,substring,trim etc. ),operators
        //4.Math class(round,floor,ceil,max,min,abs,sqrt,pow,random) returns double,booleans
        //5.If else conditionals,switch case,ternary(conditional) operator ? :
        //6.For while do while for item : collection loops,infiniti loop for(;;) ,break continue
        //7.Array concept in java ,Arrays class from jdk(java.util) in order to manipulate array
        //int[] arr={1,2,3,4,5};
        //System.out.println(Arrays.toString(arr));
        //Arrays.deepToString(arr)-prints matrix in java
        //here java.util.Arrays means that we have java folder,inside util folder nad Arrays class
        //So folders in java called as packages
        //we import java packages
        //8.Java methods and recursion
        //9.Jar files-this file means java archive and contains all packages
        //and folders inside it.
        //When you do clean it cleans all jar files in dist folder and build folder.
        //Then when you  built ,it compiles all library and adds all
        //java packages and classes inside build folder,then creates jar file in dist folder.
        //In intellij rebuild is alternative to clean and build process
        //10.java is source code file,.class is compiled file
        //11.compile decompile process
        //12.Add project reference c#-add library jar file in java the same structure
        //13.Java class,field,object,static
        //14.Null,Java memory stack,heap(hash code,reference),garbage collector,reference-value type logic
        //non-primitive types-pass by value,primitive-pass by reference
        //15.C# var also exists in java, var name="Murad";
        //16.Arguments(String[] args),System.exit(0);
        //17.Obyekt icinde obyekt Composition concept
        //18.Access modifiers public and private,getter setter methods(OOP Encapsulation)
        //Intellij can automatically create getter setter
        //19.Java package import concepts
        //import package name.*-imports all class files inside package
        //import static package name.class name.*-imports only static fields of class
        //20.Array of classes(primitive types)
        //21.POJO(Plain old java object)-just an object,can be any class
        //22.BEAN-Bean also a pojo,but BEAN is a class which has public constructor
        //and every property inside class have getter/setter methods
        //Bean used for data transfer operations.
        //23.this keyword belongs to object and help us to call class constructor,
        // field and methods inside class
        //24.Class Constructor,Constructor chaining with this
        //25.super keyword
        //26.Java Wrapper types helps us to use primitive types as objects.
        //Also helps us to easily casting types
        //examples,int-Integer
        //Integer i=5;//or
        //Integer y=new Integer(4); syntax deprecated from java 9
        //System.out.println(i);
        //System.out.println(i.toString());//methods of Integer class,belongs to object
        //String x="123";
        //Integer st=Integer.parseInt(x);//static methods of Integer class,belongs class
        //System.out.println(st);
        //27.ctrl+alt multi selection of lines and tab moves all lines
        //28.double is default type in decimal numbers(8 byte),float numbers written like 4.5f(4 byte)
        //29.Integer i=5;
        //        int y=i;Boxing and unboxing
        //30.Integer i=5 and Integer y=new Integer(5) memory difference
        //31.Integer i=128 Integer t=128 when it is 128 it creates new reference
        //so i==t will be false , but when it is 127 it is okay , it is just limit in primitive types
        //32.Random class (rand.nextInt) is not same with Math.random
        //33.String is char array in background
        //char[] arr={'s','t'};
        //String x=new String(arr);
        //34.String x=new String("a"); String x=new String("a");
        //String a="a"; String b="a";
        //Here in first lines we create two different references in different memory address
        //But in below syntax,we create them in String pool,
        //we create a variable with a value,b variable looks to pool
        // and if it exists in pool,then use same reference
        //35.equals compares values,but == compares references
        //36.equals.getHashcode,getClass,tostring default object methods
        //37.String.valueOf(4)-creates string or 4+"" write
        //38.String builder mutable but String immutable
        //StringBuilder builder=new StringBuilder();
        //builder.append("s");
        //builder.append("alam");
        //builder.setCharAt(0,'k');
        //System.out.println(builder); // or builder.toString()
        //39.In string in order to reach of index, we use charAt method
        //String x="SER";
        //for (int i=0;i<x.length();i++){
        //    System.out.println(x.charAt(i));
        //}
        //40.char '' String ""
        //41.String appends with += operator
        //42.StringBuffer and StringBuilder is the same,but buffer is synchronized,builder is not.
        // StringBuffer buff=new StringBuffer();
        // endregion//region Java Exercises Month-1
       //region Java Exercises Month-1

       var number=new Scanner(System.in).nextInt();

        MathUtil.Task1.findby2(number);//Task-1 Solution
        MathUtil.Task2.prime(number);//Task-2 Solution
        System.out.println(MathUtil.Task3.max_consecutive_ones(new int[]{1,1,0,1,1,1}));//Task-3 Solution
        //endregion
    }
}
