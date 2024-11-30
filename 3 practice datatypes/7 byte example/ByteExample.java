public class ByteExample {
    public static void main(String[] args) {
        int a = 120;
        // byte b = a + 10; // Ошибка компиляции
        byte c = (byte)(a + 10); // 130 -> -126
        // byte d = a + 1; // Ошибка компиляции
        System.out.println(c);
    }
}