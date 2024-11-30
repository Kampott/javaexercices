public class OperatorsExample {
    public static void main(String[] args) {
        // Операторы + и +=
        String text = "Hello";
        text += " World"; // Конкатенация
        System.out.println(text); // Hello World

        int a = 10, b = 20;
        int c = a + b; // Сложение
        System.out.println("a + b = " + c);

        // Логические операторы == и !=
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true

        // Оператор присваивания =
        int d = c; // Присваивание
        System.out.println("d = " + d);

        // Операторы сравнения >, <, >=, <=
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // Логические операторы &&, ||, !
        boolean condition = a < b && b > 0; // true
        System.out.println("condition: " + condition);
        condition = a > b || b > 0; // true
        System.out.println("condition: " + condition);
        System.out.println("!condition: " + !condition); // false

        // Побитовые операторы &, |, ^, ~
        int x = 5; // 0101 в бинарной системе
        int y = 3; // 0011 в бинарной системе
        System.out.println("x & y: " + (x & y)); // 1
        System.out.println("x | y: " + (x | y)); // 7
        System.out.println("x ^ y: " + (x ^ y)); // 6
        System.out.println("~x: " + ~x); // -6

        // Сдвиговые операторы >>, >>>, <<
        int shiftValue = 16; // 00010000
        System.out.println("shiftValue >> 2: " + (shiftValue >> 2)); // 4
        System.out.println("shiftValue >>> 2: " + (shiftValue >>> 2)); // 4
        System.out.println("shiftValue << 2: " + (shiftValue << 2)); // 64

        // Условный оператор ?:
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);

        // Префиксная и постфиксная форма ++ и --
        int counter = 10;
        System.out.println("Префиксный ++: " + (++counter)); // 11
        System.out.println("Постфиксный ++: " + (counter++)); // 11
        System.out.println("После постфиксного ++: " + counter); // 12
        System.out.println("Префиксный --: " + (--counter)); // 11
        System.out.println("Постфиксный --: " + (counter--)); // 11
        System.out.println("После постфиксного --: " + counter); // 10
    }
}