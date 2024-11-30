class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Wrapper<Integer> integerWrapper = new Wrapper<>(10);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");

        // Применение instanceof для проверки типа объекта
        if (integerWrapper instanceof Wrapper) {
            System.out.println("integerWrapper is an instance of Wrapper.");
        }

        if (stringWrapper instanceof Wrapper) {
            System.out.println("stringWrapper is an instance of Wrapper.");
        }

        // Проверка конкретного типа в Wrapper
        if (integerWrapper.getItem() instanceof Integer) {
            System.out.println("The item in integerWrapper is of type Integer.");
        }

        if (stringWrapper.getItem() instanceof String) {
            System.out.println("The item in stringWrapper is of type String.");
        }
    }
}