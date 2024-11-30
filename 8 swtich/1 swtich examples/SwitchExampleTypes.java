public class SwitchExampleTypes {
    public static void main(String[] args) {
        // Пример с int
        int intValue = 1;
        switch (intValue) {
            case 1:
                System.out.println("Integer value is 1");
                break;
            case 2:
                System.out.println("Integer value is 2");
                break;
            default:
                System.out.println("Integer value is not 1 or 2");
        }

        // Пример с String
        String stringValue = "hello";
        switch (stringValue) {
            case "hello":
                System.out.println("String value is 'hello'");
                break;
            case "world":
                System.out.println("String value is 'world'");
                break;
            default:
                System.out.println("String value is neither 'hello' nor 'world'");
        }

        // Пример с enum
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is not Monday or Friday");
        }
    }

    enum Day {
        MONDAY, FRIDAY, SUNDAY
    }
}