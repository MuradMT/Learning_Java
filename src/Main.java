
public class Main {
    /* Month-2
    Topics covered:
    1.Pass by value(only with value types)
     */
    public static void main(String[] args){
          int a=4;
          deyish(a);
          System.out.println(a);
    }

    public static void deyish(int a) {
        a=5;
    }
}
