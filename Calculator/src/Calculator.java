import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    /*
    Проблема заключается в делении на "0", при вызове лямбды devide
    решением проблемы будет проверка на то, что делитель не равен "0":
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : x;
    в таком случае, при делителе равном "0" - деление производится не будет, результатом будет делимое число
     */
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
