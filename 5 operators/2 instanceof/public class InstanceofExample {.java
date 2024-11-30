public class InstanceofExample {
    public static void main(String[] args) {
        Object str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String)); // true

        Object number = 42;
        System.out.println("number instanceof Integer: " + (number instanceof Integer)); // true

        Object nullObject = null;
        System.out.println("nullObject instanceof String: " + (nullObject instanceof String)); // false

        Parent parent = new Parent();
        Child child = new Child();
        Parent parentReference = child;

        System.out.println("parent instanceof Parent: " + (parent instanceof Parent)); // true
        System.out.println("child instanceof Parent: " + (child instanceof Parent)); // true
        System.out.println("parentReference instanceof Child: " + (parentReference instanceof Child)); // true
    }
}

class Parent {}
class Child extends Parent {}