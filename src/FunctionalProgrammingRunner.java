import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        List<Integer> listInteger = List.of(1, 2, 3, 4, 5);

//        printBasic(list);
//        System.out.println("--------------------");
//        printNumbersWithFP(listInteger);
        printWithFPWithFiltering(listInteger);
    }

    private static void printBasic(List<String> list) {
        for (String string: list){
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(element -> System.out.println("Element - " + element));
    }

    private static void printNumbersWithFP(List<Integer> list) {
        list.stream().forEach(element -> System.out.println("Element - " + element));
    }

    private static void printBasicWithFiltering(List<String> list){
        for (String string:list){
            if (string.endsWith("at")){
                System.out.println(string);
            }
        }
    }

    private static void printWithFPWithFiltering(List<Integer> list) {
        list.stream().filter(
                element -> element%2==1)
                .forEach(
                        element -> System.out.println("Element - " + element));
    }
}
