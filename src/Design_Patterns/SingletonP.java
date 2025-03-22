package Design_Patterns;

public class SingletonP {
    private SingletonP(){

    }
    static SingletonP s=null;
    public static SingletonP createInstance(){
        if(s==null){
            s=new SingletonP();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Yep";
    }
}
