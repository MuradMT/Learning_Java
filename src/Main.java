
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
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args)  {
          List<String> list = Arrays.asList("a", "b", "c");
//          list.forEach((s)-> System.out.println(s));
//          list.forEach(System.out::println);

          Optional<String> optional = Optional.of("as");
          optional.ifPresent(System.out::println);
//          if(optional.isPresent()){
//              System.out.println(optional.get());
//          }else{
//              System.out.println(Optional.empty());
//          }

        list.stream().filter(s->s.equals("a")).forEach(System.out::println);
        List<String> bls = list.stream().filter(s -> s.equals("b")).collect(Collectors.toList());
        list.stream().filter(s -> s.equals("c")).findAny().ifPresent(System.out::println);


        list.stream().map(String::toUpperCase).forEach(System.out::println);

        int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);

        Integer reduce = list.stream().map(String::length).reduce(0, Integer::sum);

    }


}


