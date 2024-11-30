import java.util.List;

public class LowerBoundExample {
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);  // Мы можем добавлять Integer или его подклассы
    }

    public static void main(String[] args) {
        List<Number> numberList = List.of(1, 2, 3);
        List<Object> objectList = List.of("Hello", 10);

        // Метод принимает список, элементы которого могут быть Integer или суперклассами
        addNumbers(numberList);  // Работает с List<Number>
        addNumbers(objectList);   // Работает с List<Object>
    }
}
