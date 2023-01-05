import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        List<String> strings = List.of("Apple", "Ant", "Bat");
        //numbers.stream().forEach(element -> System.out.println(element));

//        int sum = fpSum(numbers);
//        System.out.println("Sum is: " + sum);

        //squaresNumbers(numbers);

        //IntStream.range(1,10).map(e -> e*e).forEach(e -> System.out.println(e));
        //strings.stream().map(s->s.toLowerCase()).forEach(s-> System.out.println(s));
        //strings.stream().map(s->s.length()).forEach(s-> System.out.println(s));
        //int number = List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
//        System.out.println(List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get());
//        List.of(23,12,34,53).stream().filter(e ->e%2==0).collect(Collectors.toList());

        IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList());


    }

    //Functional Programming
    private static int fpSum(List<Integer> numbers) {
        return numbers.stream().filter(number -> number%2==0).reduce(  0, (number1, number2) -> number1+number2);
    }


    //Structural Programming
    private static void normalSum(List<Integer> numbers) {
        int sum=0;
        for (int number: numbers){
            sum+=number; //mutations
        }
    }

    private static void squaresNumbers(List<Integer> numbers){
        numbers.stream().distinct().map(num -> num * num).forEach(e -> System.out.println(e));
    }
}
