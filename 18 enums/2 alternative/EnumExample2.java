public class EnumExample2 {
    public enum Season {
        WINTER("Cold and snowy"),
        SPRING("Fresh and green"),
        SUMMER("Hot and sunny"),
        AUTUMN("Cool and colorful");

        private final String description; // ???? ??? ????????

        // ??????????? ????????????
        Season(String description) {
            this.description = description;
        }

        // ????? ??? ????????? ????????
        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        // ??????? ???? ???????? ????????????
        for (Season season : Season.values()) {
            System.out.printf("%s: %s%n", season, season.getDescription());
        }
    }
}