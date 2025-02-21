public interface TestInterface extends Test2I {

    public abstract void getAll();
    //public abstract is hidden
     String get();
    int age=21;
    public static final int salary=0;
    //public static final is hidden

    public default void print(){

    }
    //public is hidden
}
