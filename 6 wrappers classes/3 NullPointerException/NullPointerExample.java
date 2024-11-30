public class NullPointerExample {
    public static void main(String[] args) {
        Integer boxed = null;

        // Автораспаковка, когда значение объекта-оболочки равно null
        try {
            int unboxed = boxed; // Бросает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Автораспаковка привела к NullPointerException.");
        }

        // Автоупаковка не вызывает NullPointerException
        int value = 42;
        Integer autoBoxed = value; // Работает нормально
        System.out.println("autoBoxed: " + autoBoxed);
    }
}
