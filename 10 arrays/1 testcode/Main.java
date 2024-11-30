public class Main {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};

        // До переназначения
        System.out.println("Массив a1 до переназначения: ");
        for (int num : a1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Переназначение ссылки
        a1 = a2;

        // После переназначения
        System.out.println("Массив a1 после переназначения: ");
        for (int num : a1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}