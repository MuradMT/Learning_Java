import test.*;
import java.util.Scanner;

public class Main {
    /** Month-1 Java Topics and Exercises
     * The main method serves as the entry point for the Java application.
     * It covers various Java topics and exercises.
     * 
     * Topics covered:
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
    public static void main(String[] args) {
       //region Java Exercises
        var number=new Scanner(System.in).nextInt();

        MathUtil.Task1.findby2(number);//Task-1 Solution
        MathUtil.Task2.prime(number);//Task-2 Solution
        System.out.println(MathUtil.Task3.max_consecutive_ones(new int[]{1,1,0,1,1,1}));//Task-3 Solution

        //endregion
    }
}
