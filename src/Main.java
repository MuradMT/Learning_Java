
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    //Month-5

    //Finished

    //Not-Finished

    //region Lesson-33(1,2,3,4)
    /*
         1.Stack LIFO
         2.Queue FIFO,implementation of linkedList
         3.Deque is double ended queue,additionally have
         offerFirst or Last,poll and peek also
         4.Blocking queue works in publisher-subscriber principle
         locks threads
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
        System.out.println(mystack.peek()+"End of Stack");

        Queue<Integer> myQueue=new LinkedList<>();
        myQueue.offer(1);//same as add,only difference
        //is it returns null
        myQueue.add(5);
        System.out.println(myQueue.poll());
        myQueue.offer(7);
        myQueue.offer(9);
        System.out.println(myQueue.remove());//poll returns null,remove exception
        System.out.println(myQueue.peek());
        System.out.println(myQueue.element()+"End of Queue");//element and peek again same,
        // but peek only returns null

        Deque<Integer> myDeque=new LinkedList<>();
        myDeque.offerFirst(1);
        myDeque.offer(5);
        myDeque.offer(9);
        myDeque.offerLast(11);
        myDeque.offerFirst(0);
        System.out.println(myDeque.poll());
        System.out.println(myDeque.pollLast());
        System.out.println(myDeque.peek());
        System.out.println(myDeque.peekLast()+"End of Deque");

        BlockingQueue<Integer> myBQ=new LinkedBlockingQueue<>();
        myBQ.offer(1);
        System.out.println(myBQ.peek());
    }



}


