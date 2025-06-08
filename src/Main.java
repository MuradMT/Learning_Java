
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    //Month-5

    //Finished

    //Not-Finished

    //region Lesson-33(1,2,3,4)
    /*
         1.Stack LIFO
     */
    //endregion

    public static void main(String[] args)  {
        Stack<Integer> mystack=new Stack<>();
        mystack.push(1);
        mystack.push(17);
        mystack.push(14);
        mystack.push(19);
        mystack.push(10);
        System.out.println(mystack.pop());
        System.out.println(mystack.peek());
    }



}


