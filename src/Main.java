
public class Main {
    /* Month-2
    Topics covered:
    1.Method overloading
    2.Wrapper types
    3.boxing,unboxing
    4.New object creation after the value of Integer 127
     */
    public static void main(String[] args) {
         int i=0;
         Integer j=null;
         //Integer k=new Integer(i); deprecated code
        Integer y=i; //auto-boxing
        int z=y; //auto unboxing
        var t= y.toString();
        Byte b=0;
        Long l=0l;
        Character c=' ';
        Boolean bb=true;
        String name="Murad";//char array

        Integer aa=128;
        Integer ab=128;
        //Until 127 ,they create same reference address
        // aa!=ab
        //aa=127 ab=127 aa==ab
    }

    public static int foo(int a, int b) {
        return a+b;
    }
    public static double foo(double a, double b) {
        return a+b;
    }



}
