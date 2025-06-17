
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.Instant;
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

    //region Lesson-33(1,2,3,4)
    /*
         1.Stack LIFO
         2.Queue FIFO,implementation of linkedList
         3.Deque is double ended queue,additionally have
         offerFirst or Last,poll and peek also
         4.Blocking queue works in publisher-subscriber principle
         locks threads
         5.Priority Queue is based on priorities
         In java,priority queue acts by default for Integers
         as min heap,
         if we use Comparator.reverseOrder it becomes maxHeap
         Simply Heap is priority Queue
         6.MySql,PostgresSql,what is server all day running computer
         7.Sql queries,mysql workbench
         8.Database is called schema
         9.Tables,common sql commands such as select where etc
         Select,Where,Update,Insert,Delete,Order By Joins etc
         10.Keys,auto increment etc,bit type,null,blob type
         11.Charset selection such as utf8 or ascii
         We do this when we create schema
         12.Mysql has auto commit feature
         13.Detailed joins Left Right Inner Outer Cross
     */
    //endregion

    //Not-Finished
    //region Lesson-34(1,2)
    /*
          1.Install mysql connector from java2s
          2.MySql connector is a part of JDBC,
          implemented on top of it
          3.Shortcut-when you write .var at the end of function it returns
          actual data type as variable
          4.Main topics:Connection,Statement,PreparedStatement,ResultSet
          5.Explained services and repositories
          6.executeUpdate returns int,execute returns boolean
          7.Talked about sql injection
          8.Transaction,commit,rollback
     */
    //endregion
    //region Lesson-35(1,2,3,4)
    /*

     */
    //endregion
    //region Lesson-36(1,2)
    /*

     */
    //endregion
    //region Lesson-37(1,2)
    /*

     */
    //endregion
    //region Lesson-38(1,2)
    /*

     */
    //endregion
    //region Lesson-39(1,2)
    /*

     */
    //endregion
    //region Lesson-40(1,2)
    /*

     */
    //endregion


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Stack<Integer> mystack=new Stack<>();
//        mystack.push(1);
//        mystack.push(17);
//        mystack.push(14);
//        mystack.push(19);
//        mystack.push(10);
//        System.out.println(mystack.pop());
//        System.out.println(mystack.peek()+"End of Stack");
//
//        Queue<Integer> myQueue=new LinkedList<>();
//        myQueue.offer(1);//same as add,only difference
//        //is it returns null
//        myQueue.add(5);
//        System.out.println(myQueue.poll());
//        myQueue.offer(7);
//        myQueue.offer(9);
//        System.out.println(myQueue.remove());//poll returns null,remove exception
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.element()+"End of Queue");//element and peek again same,
//        // but peek only returns null
//
//        Deque<Integer> myDeque=new LinkedList<>();
//        myDeque.offerFirst(1);
//        myDeque.offer(5);
//        myDeque.offer(9);
//        myDeque.offerLast(11);
//        myDeque.offerFirst(0);
//        System.out.println(myDeque.poll());
//        System.out.println(myDeque.pollLast());
//        System.out.println(myDeque.peek());
//        System.out.println(myDeque.peekLast()+"End of Deque");
//
//        BlockingQueue<Integer> myBQ=new LinkedBlockingQueue<>();
//        myBQ.offer(1);
//        System.out.println(myBQ.peek());
//        PriorityQueue<Task> myPQ=new PriorityQueue<>(Comparator.comparingInt(t->t.priority));
//        myPQ.offer(new Task("Email",1));
//        myPQ.offer(new Task("Notes",5));
//        myPQ.offer(new Task("Messages",3));
//        myPQ.offer(new Task("Text",4));
//        myPQ.offer(new Task("Image",2));
//
//        while(!myPQ.isEmpty()){
//            System.out.println(myPQ.poll());
//        }
//        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
//        minHeap.offer(1);
//        minHeap.offer(2);
//        minHeap.offer(3);
//        System.out.println("MinHeap elements:");
//        Iterator<Integer> minHeapItems=minHeap.iterator();
//        while(minHeapItems.hasNext()){
//            System.out.println(minHeapItems.next());
//        }
//
//        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
//        maxHeap.offer(1);
//        maxHeap.offer(2);
//        maxHeap.offer(3);
//        System.out.println("MaxHeap elements:");
//        Iterator<Integer> maxHeapItems=maxHeap.iterator();
//        while(maxHeapItems.hasNext()){
//            System.out.println(maxHeapItems.next());
//        }
        List<Student> students = DB.getStudents();
        Student student = DB.getStudent(1);
        System.out.println(student);
        System.out.println(students);
        Student std=new Student("MyN","MyS",22);
        boolean b = DB.addStudent(std);
        System.out.println(b);
        System.out.println(DB.updateStudentAge(6,236));
    }

    public static class Task{
        public String name;
        public int priority;
        public Task(String name,int priority){
            this.name=name;
            this.priority=priority;
        }
        @Override
        public String toString() {
            return name+ " Priority: " + priority;
        }
    }
}


