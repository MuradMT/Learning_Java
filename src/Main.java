
public class Main {
    /* Month-2
    Topics covered:
    1.Class naming rules-pascal case
    Method naming rules-camel case
    2.Class name and file name
    must be same if you want to use public access modifier
    1 file can contain multiple classes
    3.Metaspace-stores class metadata,also method information
    4. JVM relationship with Stack-keeps values or value types
    Heap-keeps objects or references
    Value and Reference types.
    5.Methods kept in stack,
    if you do infinite recursion,then probably you wil get StackOverflow Error.
    6.Instance members belongs to object,but
     Static members to class
    7.Instance and Static relationship
    8.Sending reference to method
     */

    public static void main(String[] args) {
           Student a=new Student();
           Student b=deyish(a);
           b.name="Sani";
        System.out.println(a.name);
        System.out.println(b.name);
    }

        public static Student deyish(Student c) {
        c.name="Nasir";
        return c;
    }
}
