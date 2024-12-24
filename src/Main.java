
public class Main {
    /* Month-2
    Topics covered:
    1.Class,Field,Object(RAM creates on each initiation),access modifiers
    2.Static keyword(RAM creates just on time,all static elements belongs to class)
    Note.In java ,static class just a nested class,you
    can not create something such as static class x,
    you only can add this static class inside class.
    In c#,the situation is different.
    3.Memory reference of object
    4.public static Student sd=new Student();-static object inside class
    5.Extra. Pointer(C programming language topic) example:
    int x=5;
    int *pX=&x;
    int y=px;
    Pointer just keep memory adress of variable
    and set the value to new variable ,easy :)
    Pointer is  memory adress,modifies it directly.
    Reference allows you to modify things in the adress,not the memory adress.
    JVM  registers references inside it, do not show it directly.
    JVM does not have ability to modify RAM,
    JVM just accesses the RAM and take essential reference.
    In C you can access RAM.
    6.Extra. Learned about destkop parts such as
    graphics card-graphics processing unit or gpu
    figures out how things must be look
    cpu-central processing unit or processor
    does things,run programs,brain of computers
    ram-random access memory or memory
    small things temporally stored fast access
    hard drive-disk drive or storage
    large storage but low access (we have also sdd solid state drive,and hard disk drive)
    -4 complex ones,deals with data
    mother board-communication between components
    power supply
    case
    -3 simple ones
     */
    public static Student sd=new Student();
    public static void main(String[] args) {
        sd.name="Murad";
        sd.surname="Mammadzada";
        sd.age=21;
        Student.print(sd);
        Student sd=new Student();

    }
}
