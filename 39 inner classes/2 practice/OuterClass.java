public class OuterClass {
    private int outerPrivateField = 20;
    
    public void printOuterField() {
        System.out.println("OuterClass private field: " + outerPrivateField);
    }

    public class InnerClass {
        public void accessOuterField() {
            System.out.println("Accessing private outer field from InnerClass: " + outerPrivateField);
        }
        
        public void callOuterMethod() {
            printOuterField();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterField();
        inner.callOuterMethod();
    }
}
