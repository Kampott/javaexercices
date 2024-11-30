public class OuterClass {
    private int outerField = 10;

    // Внутренний класс с различными спецификаторами доступа
    public class PublicInnerClass {
        public void display() {
            System.out.println("PublicInnerClass - outerField: " + outerField);
        }
    }

    private class PrivateInnerClass {
        public void display() {
            System.out.println("PrivateInnerClass - outerField: " + outerField);
        }
    }

    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("ProtectedInnerClass - outerField: " + outerField);
        }
    }

    class DefaultInnerClass {
        public void display() {
            System.out.println("DefaultInnerClass - outerField: " + outerField);
        }
    }
}
