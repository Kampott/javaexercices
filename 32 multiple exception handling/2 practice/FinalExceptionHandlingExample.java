public class FinalExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // ????????? ??????????
            generateException();
        } catch (final Exception e) {
            // ????????????? final: ?????????? ?? ????? ???? ????????
            System.out.println("??????? ??????????: " + e.getClass().getSimpleName());
        }
    }

    // ????? ??? ????????? ??????????
    public static void generateException() throws Exception {
        throw new Exception("????????? ??????????");
    }
}