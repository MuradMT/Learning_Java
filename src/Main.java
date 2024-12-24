import test.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //region Month-1
    /* Topics covered:
     * 1. Introduction to Java and IDE concepts.
     * 2. Java Byte Code, Operating System, and CPU interaction.
     * 3. Debugging techniques: Step over, Step into, Step out.
     * 4. Arithmetic, Relational, Logical, and Assignment operators.
     * 5. ASCII Table, UTF8 Encoding, and data type capacities.
     * 6. Comments, variables, data types, type casting, and scope.
     * 7. Scanner class for input, print methods, and escape symbols.
     * 8. String methods and operators.
     * 9. Math class methods and their return types.
     * 10. Conditional statements: if-else, switch case, ternary operator.
     * 11. Loop constructs: for, while, do-while, and enhanced for loop.
     * 12. Array concepts and the Arrays class.
     * 13. Java methods and recursion.
     * 14. JAR files, build processes, and IntelliJ rebuild.
     * 15. Source code and compiled files.
     * 16. Compile and decompile processes.
     * 17. Project references and library imports.
     * 18. Java class structure, fields, objects, and static members.
     * 19. Memory management: stack, heap, garbage collection.
     * 20. Access modifiers, getters, setters, and encapsulation.
     * 21. Package import concepts.
     * 22. Array of classes and primitive types.
     * 23. POJO and BEAN concepts.
     * 24. 'this' keyword and constructor chaining.
     * 25. 'super' keyword.
     * 26. Java Wrapper types and type casting.
     * 27. Multi-line selection and tabbing in IntelliJ.
     * 28. Default types for decimal numbers.
     * 29. Boxing and unboxing of primitive types.
     * 30. Memory differences in Integer objects.
     * 31. Random class vs Math.random.
     * 32. String as a char array.
     * 33. String pool and reference comparison.
     * 34. equals() vs == for value and reference comparison.
     * 35. Default object methods: hashCode, getClass, toString.
     * 36. String creation methods.
     * 37. StringBuilder and StringBuffer differences.
     * 38. charAt method for string indexing.
     * 39. String concatenation with += operator.
     * 
     * Exercises:
     * 1. Task-1: Find by 2 using MathUtil.
     * 2. Task-2: Prime number check using MathUtil.
     * 3. Task-3: Find maximum consecutive ones in an array using MathUtil.
     */

    //endregion
    //region Month-2
    /*
    Topics covered:
    1.Two-dimensional array
    Syntax of two-dimensional and jagged are the same,different from c#.
    int[][] two_dimensional_arr=new int[2][2];
    int[][] two_dimensional_arr={
                 {0,1},{2,3},{4,5,6}
        };
    Two dimensional arrays are generally used as a matrix,row and column size are same in most cases.
    2.Jagged Array
    int[][]  jagged_ar=new int[2][];
        jagged_ar[0]=new int[]{6,7,8};
        jagged_ar[1]=new int[]{0,9};
    System.out.println(Arrays.deepToString(jagged_arr));
    Jagged arrays are generally used when the row and column sizes are different from each other.
    3.Three-dimensional array
    int[][][] arr=new int[2][2][2];
          int[][][] arr1={
                  {
                          {0,1},{2,3}
                  },
                  {
                          {4,5},{6,7}
                  }
          };
    Three-dimensional arrays is just array of two-dimensional arrays.
    4.Essential static and object methods of String class
    4.1 Static methods/ String.format
    String data=String.format("height:%.2f,weight:%d,name:%s",1.9500000000,90,"random");
    4.2 Object methods/ lower case,upper case,length,charAt,equals
    equalsIgnoreCase,contains,split,trim,replace,concat
    startsWith,endsWith,indexOf,lastIndexOf,substring(and remove),isEmpty
    compareTo-if true,returns 0
    String text="Murad geldi";
          System.out.println(text.toLowerCase());
          System.out.println(text.toUpperCase());
          System.out.println(text.length());
          System.out.println(text.charAt(0));
          System.out.println(text.equals("hi"));
          System.out.println(text.equalsIgnoreCase("murad"));
          System.out.println(text.contains("hi"));
          var arr=text.split("");
          System.out.println(arr[0]);
          System.out.println(text.trim());
          System.out.println(text.replace('r','h'));
          System.out.println(text.concat("hi"));
          System.out.println(text.startsWith("m"));
          System.out.println(text.endsWith("t"));
          System.out.println(text.indexOf("d")); // index is 4
          System.out.println(text.lastIndexOf("d")); index is 9
          System.out.println(text.substring(0,3));
          System.out.println(text.substring(3));//acts as c# remove method
          System.out.println(text.isEmpty());
          System.out.println(text.compareTo("mm"));
       ReplaceAll use regex
       String text="123456 go";
       System.out.println(text.replaceAll("[0-9]","hello"));
     */
    //endregion
    public static void main(String[] args) {

    }
}
