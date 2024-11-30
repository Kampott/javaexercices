public class TypeNarrowing {
    public static void main(String[] args) {
        int i = 256;
        byte b = (byte) i; // Потеря данных
        System.out.println(b); // -128 (переполнение)
    }
}