// Пакет A
package A;

// Класс с разными спецификаторами доступа
public class ExampleClass {
    public String publicField = "Доступен всем";
    protected String protectedField = "Доступен в этом пакете и подклассам в других пакетах";
    String defaultField = "Доступен только в этом пакете";
    private String privateField = "Доступен только внутри этого класса";

    // Публичный метод
    public void publicMethod() {
        System.out.println("Публичный метод: " + publicField);
    }

    // Защищённый метод
    protected void protectedMethod() {
        System.out.println("Защищённый метод: " + protectedField);
    }

    // Метод с доступом по умолчанию
    void defaultMethod() {
        System.out.println("Метод с доступом по умолчанию: " + defaultField);
    }

    // Приватный метод
    private void privateMethod() {
        System.out.println("Приватный метод: " + privateField);
    }

    // Метод для демонстрации доступа внутри класса
    public void demonstrateAccess() {
        System.out.println("Доступ внутри класса:");
        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
