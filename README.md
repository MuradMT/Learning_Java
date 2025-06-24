<h1>I follow the JAVA course from Sarkhan Rasullu(UDEMY).</h1>
<h2>Course link:https://www.udemy.com/course/sifirdan-sona-java-2024</h2>
Java 8 features(lambda expressions):

1.foreach working in background like this:we implement consumer class and oveeride its accept method then do some actions.

We can send lambda expression or method reference inside foreach:

```java
list.forEach((s)-> System.out.println(s));
list.forEach(System.out::println);
//lambda useful when we have multiple lines such as
// (s)-> { //do1 //do2 }
```

foreach generally used to loop over elements and print then ,do not modify elements.

2.optional ifPresent simply checks and prints,example:

```java
 Optional<String> optional = Optional.of("as");
          optional.ifPresent(System.out::println);
          //replaces this one
//          if(optional.isPresent()){
//              System.out.println(optional.get());
//          }else{
//              System.out.println(Optional.empty());
//          }
```

3.Lambda expressions main goal is to implement ***functional programming i***n java.

4.filter helps us to add specific condition and get data,we use with stream and collect together or we can directly print the result of filter,example:

```java
list.stream().filter(s->s.equals("a")).forEach(System.out::println);
List<String> b = list.stream().filter(s -> s.equals("b")).
collect(Collectors.toList());
```

5.We can create stream list directly with Stream.of

6.parallelStream() creates async stream.

7.We can add findAny findFirst methods at the end of filter and use it with ifPresent together :

```java
list.stream().filter(s -> s.equals("c"))
.findAny().ifPresent(System.out::println);
```

8.Maps general functions is to change the existing elemnts of list,we use it like this:

```java
 list.stream().map(String::toUpperCase).forEach(System.out::println);
 //make all elements f list uppercase and prints with foreach
 //we can also collect again
```

9.In c# we have special delegates called action func predicate etc send references.In java we have ***functional interfaces***:

***Consumer→***gets parameter returns void,foreach use it

***Function→***gets parameter returns value , map uses it.

***Predicate→***gets parameter returns boolean,filter uses it.

10.Optional has orElse and orElseThrow.

11.mapToInt does convertion of current tstream to. integer stream,sum() sums this,example usage:

```java
int sum = list.stream().mapToInt(String::length).sum();
        System.out.println(sum);
```

12.Or we can simply use reduce:

In Java, `reduce()` is a **terminal operation** in the Stream API that combines elements of a stream into a **single result**(like a sum, product, concatenation, etc.) using an **accumulator function**.

---

---

## Basic Example – Sum of Integers

```java
java
CopyEdit
List<Integer> numbers = List.of(1, 2, 3, 4, 5);

int sum = numbers.stream()
    .reduce(0, Integer::sum);

System.out.println(sum); // Output: 15

```

- `0` is the **identity** (starting value)
- `(a, b) -> a + b` is the **accumulator** (adds each number)

---

## Without Identity – Returns Optional

```java
java
CopyEdit
List<String> list = List.of("a", "b", "c");

Optional<String> result = list.stream()
    .reduce((s1, s2) -> s1 + s2);

result.ifPresent(System.out::println); // Output: abc

```

13.flatmap combines 2 lists together.

14.Intermediate operations vs Terminal ones:

map vs foreach

filter vs reduce
