public class TypePromotion {
    public static void main(String[] args) {
        byte b = 10;
        int i = b + 20; // byte -> int
        float f = i + 2.5f; // int -> float
        double d = f + 1.1; // float -> double
        System.out.println(d); // 33.6
    }
}