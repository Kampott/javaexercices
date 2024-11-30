interface MyInterface {
    // Вложенный статический класс внутри интерфейса
    static class NestedClass {
        public void func() {
            System.out.println("Метод func() из вложенного класса в интерфейсе");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра вложенного класса через имя интерфейса
        MyInterface.NestedClass nestedClass = new MyInterface.NestedClass();
        nestedClass.func();
    }
}
