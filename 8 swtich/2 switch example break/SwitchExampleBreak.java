public class SwitchExampleBreak {
    public static void main(String[] args) {
        int i = 0;
        int value = 2;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2; // Здесь нет break, выполнение продолжается
            case 3:
                i = 3; // Это тоже выполнится
                break;
            default:
                i = 4;
        }

        System.out.println("i = " + i);
    }
}