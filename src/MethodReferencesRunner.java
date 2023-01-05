import java.util.List;

public class MethodReferencesRunner {
    public static void main(String[] args) {
//        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
//                .map(String::length) //same is .map(s->s.length())
//                .forEach(MethodReferencesRunner::print); // same is .forEach(s-> MethodReferencesRunner.print(s));

        Integer  max = List.of(23,45,67,34).stream()
                .filter(MethodReferencesRunner::isEven)
                .max(MethodReferencesRunner::maxNumber)
                .orElse(0);
        System.out.println(max);
    }

    public static void print(Integer number){
        System.out.println(number);
    }

    public static int maxNumber(Integer n1, Integer n2){
        if(n1>n2){
            return n1;
        } else if (n1<n2) {
            return n2;
        }else{
            return 0;
        }
    }

    public static boolean isEven(Integer number){
        return number%2==0;
    }
}
