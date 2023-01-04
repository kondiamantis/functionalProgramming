import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        //numbers.stream().forEach(element -> System.out.println(element));

        int sum = fpSum(numbers);

        System.out.println("Sum is: " + sum);

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
}
