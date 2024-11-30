// Пакет B
package B;

import A.ExampleClass;

public class NonSubclassInAnotherPackage {
    public void demonstrateAccess() {
        ExampleClass example = new ExampleClass();
        System.out.println("Доступ из класса, не являющегося подклассом, в другом пакете:");
        System.out.println(example.publicField); // Доступен
        // System.out.println(example.protectedField); // Ошибка: protectedField недоступен
        // System.out.println(example.defaultField); // Ошибка: defaultField недоступен
        // System.out.println(example.privateField); // Ошибка: privateField недоступен
        example.publicMethod();
        // example.protectedMethod(); // Ошибка: protectedMethod недоступен
        // example.defaultMethod(); // Ошибка: defaultMethod недоступен
        // example.privateMethod(); // Ошибка: privateMethod недоступен
    }
}
