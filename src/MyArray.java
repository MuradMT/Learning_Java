import java.util.Arrays;

public class MyArray<T> {
    public MyArray(){

    }
    public MyArray(int initialSize){
        this.arr=new Object[initialSize];
    }
    private Object[] arr=new Object[100];
    int i=0;
    public void add(T obj){
        if(i==arr.length){
            arr= Arrays.copyOf(arr,arr.length+(arr.length/2));
        }
        arr[i]=obj;
    }
    public T get(int num){
        return (T) arr[num];
    }
}
