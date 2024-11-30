// Пакет A
package A;

// Класс в том же пакете
public class SamePackageClass {
    public void demonstrateAccess() {
        ExampleClass example = new ExampleClass();
        System.out.println("Доступ из класса в том же пакете:");
        System.out.println(example.publicField); // Доступен
        System.out.println(example.protectedField); // Доступен
        System.out.println(example.defaultField); // Доступен
        // System.out.println(example.privateField); // Ошибка: privateField недоступен
        example.publicMethod();
        example.protectedMethod();
        example.defaultMethod();
        // example.privateMethod(); // Ошибка: privateMethod недоступен
    }
}
