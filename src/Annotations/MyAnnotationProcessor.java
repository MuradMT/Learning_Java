package Annotations;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Set;

public class MyAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        Field[] declaredFields=Test.class.getDeclaredFields();
        Set<? extends Element> elementsAnnotatedWith= roundEnv.getElementsAnnotatedWith( MyAnnotation.class);
        return false;
        //we used reflection
    }
}
