import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        final Predicate<Integer> integerPredicate = getIntegerPredicate();
        List.of(23,43,34,45).stream().filter(integerPredicate).map(n->n*n).forEach(e-> System.out.println(e));
        System.out.println("-------------");
        List.of(23,43,34,45).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMapper()).forEach(new SystemOutConsumer());

        //.filter(new EvenNumberPredicate())
        //Predicate<? super T> other
        //boolean test(T t)

        //.forEach(new SystemOutConsumer())
        //Consumer<? super T> after
        //void accept(T t);

        //.map(n->n*n)
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);

    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
    }
}

class EvenNumberPredicate implements Predicate<Integer>{
    @Override
    public boolean test(Integer number){
        return number%2==0;
    }
}

class SystemOutConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer number){
        System.out.println(number);
    }
}

class NumberSquareMapper implements Function<Integer, Integer>{
    @Override
    public Integer apply(Integer number) {
        return number*number;
    }
}
