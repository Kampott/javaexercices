import java.util.List;

public class UpperBoundExample {
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        List<Double> doubles = List.of(1.1, 2.2, 3.3);

        // Метод принимает список объектов, который является потомком Number
        printNumbers(integers);
        printNumbers(doubles);
    }
}