public class OuterClass {
    private int outerField = 100;

    public class InnerClass {
        private int innerField = 200;

        public void display() {
            System.out.println("InnerClass field: " + innerField);
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        inner.display();
        System.out.println("Outer class field from InnerClass: " + outerField);
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();
    }
}
