package Design_Patterns;

public class Singleton {
    private Singleton(){

    }
    static Singleton s=null;
    public static Singleton createInstance(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Yep";
    }
}
