import java.util.function

public class Homework8{
    void main{

    }

    static <T, U, R> Function<T, R> compose(Function<U,R> f, Function<T, U> g){
        return t -> f.apply(g.apply(t));
    }
}