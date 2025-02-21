public class MyThrowable extends Throwable{
    public MyThrowable(String message,Throwable t){
        super(message,t);
    }
    public MyThrowable(String message){
        super(message);
    }
}
