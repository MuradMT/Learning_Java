package Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
//class compiler keeps in class file but not in vm
//source avoid compiler
//runtime compiler keeps info and use in vm in runtime
public @interface MyAnnotation {
    //We have annotation processor and reflection API
    int min();
}
