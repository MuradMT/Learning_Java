public class GenericClass <T extends String,U> extends GenericcClass2<String,Integer>{

    public final T message;

    public GenericClass(T message) {
        this.message = message;
    }

    public static <A extends String> A print(A parameter){
        return parameter;
    }
}
