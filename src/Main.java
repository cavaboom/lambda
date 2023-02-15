import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        class Number {
            int num;

            public Number (int num) {
                this.num = num;
            }

            @Override
            public String toString() {
                return "Number{" +
                        "num=" + num +
                        '}';
            }
        }

        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate1.test(1));

        Predicate<Integer> predicate2 = x -> x > 0;
        System.out.println(predicate2.test(3));

        class Name{
            String name;

            public Name(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        Name name1 = new Name("Bob");
        Name name2 = new Name("Alex");

        Consumer<Name> consumer1 = new Consumer<Name>() {
            @Override
            public void accept(Name name) {
                System.out.println("Hello " + name);
            }
        };
        consumer1.accept(name1);

        Consumer<Name> consumer2 = x -> System.out.println("Hello " + x);
        consumer2.accept(name2);

        /*class Double {
            double number = 13.64;

            public Double(double number) {
                this.number = number;
            }

            @Override
            public String toString() {
                return "Double{" +
                        "number=" + number +
                        '}';
            }
        }*/

        double number = 13.64;
        Function<Double, Long> function1 = new Function<>() {
            @Override
            public Long apply(Double numberDouble) {
                return Math.round(numberDouble);
            }
        };
        System.out.println(function1.apply(number));

        double number1 = 82.12;

        Function<Double, Long> function2 = x -> Math.round(x);
        System.out.println(function2.apply(number1));

        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);
        System.out.println(supplier2.get());

    }
}
