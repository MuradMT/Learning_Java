package Annotations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Test {
    public String name;
    @MyAnnotation(min=3)
    public static void print(){
        System.out.println(12345);
    }
}
