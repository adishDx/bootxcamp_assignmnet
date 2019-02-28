import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question_5 {

    public static void main(String[] args) {

        Consumer<Integer> consume = e-> System.out.println(e+1);

        consume.accept(55);

        Supplier<Integer> supply = () -> 55;

        System.out.println(supply.get());

        Predicate<Integer> predicate = (a) -> a>5;

        System.out.println(predicate.test(10));

        Function<String,String> func = (a) -> a+" Jain";

        System.out.println(func.apply("Adish"));
    }

}
