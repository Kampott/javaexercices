import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 2, 8, 6, 4};

        // toString - ??????????? ?????? ? ??????
        System.out.println("?????? (toString): " + Arrays.toString(array));

        // sort - ????????? ??????
        Arrays.sort(array);
        System.out.println("??????????????? ??????: " + Arrays.toString(array));

        // binarySearch - ????? ????????
        int index = Arrays.binarySearch(array, 8);
        System.out.println("?????? ???????? 8: " + index);

        // equals - ????????? ????????? ????????
        int[] anotherArray = {2, 4, 6, 8, 10};
        boolean areEqual = Arrays.equals(array, anotherArray);
        System.out.println("??????? ?????: " + areEqual);

        // compare - ?????????? ???????
        int[] arrayToCompare = {1, 2, 3, 4, 5};
        int comparisonResult = Arrays.compare(array, arrayToCompare);
        System.out.println("????????? ????????? ????????: " + comparisonResult);
    }
}
