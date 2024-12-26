
public class Main {
    /* Month-2
    Topics covered:
    1.Garbage collector,pointer and  reference detailed explanation
    old(orphan object) and new generation
    2.System.gc(); class garbace collector ,but do not execute right away
    depends on the mood of garbage collector lol
    3.native keyword-helps us to use native code
    such as c or c++ etc inside java via JAVA NATIVE INTERFACE
    4.HotSpot is a type of JVM that contains JIT compiler
    5.Compiling process(with the help of javac.exe)
    .java file-initial java codes
    .class file-byte code (java.exe reads byte code,like java Main runs program)
    6.JDK JVM JRE
    7.Linux commands- cd ls pwd vim class path
    8.DLL-dynamic link library collection of small programs,
    larger programs uses to do complete specific tasks
    9.exe-executable file runs programs such as java.exe
     */
    public static void main(String[] args){
        Student a=new Student();
        Student b=new Student();
        a=b;
        System.gc();
        System.out.println(a.name);
        System.out.println(b);
    }
}
