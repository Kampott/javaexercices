// Пакет B
package B;

import A.ExampleClass;

// Подкласс в другом пакете
public class SubclassInAnotherPackage extends ExampleClass {
    public void demonstrateAccess() {
        System.out.println("Доступ из подкласса в другом пакете:");
        System.out.println(publicField); // Доступен
        System.out.println(protectedField); // Доступен
        // System.out.println(defaultField); // Ошибка: defaultField недоступен
        // System.out.println(privateField); // Ошибка: privateField недоступен
        publicMethod();
        protectedMethod();
        // defaultMethod(); // Ошибка: defaultMethod недоступен
        // privateMethod(); // Ошибка: privateMethod недоступен
    }
}
