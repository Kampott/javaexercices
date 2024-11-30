### Примеры использования стандартных аннотаций:
1. @Override — используется для указания, что метод переопределяет метод родительского класса.

2. @Deprecated — сообщает, что элемент (метод, класс и т. д.) устарел и не рекомендуется для использования в будущем.

3. @SuppressWarnings — используется для подавления предупреждений компилятора, например, предупреждений о неиспользуемых переменных.
### Примеры:
1. Аннотация @Override:
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```
#### Пояснение:
- Аннотация @Override сообщает компилятору, что метод sound в классе Dog переопределяет метод с таким же названием из родительского класса Animal.
- Это помогает избежать ошибок, например, если метод в родительском классе был изменен или удален.
2. Аннотация @Deprecated:
```java
class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method");
    }
}

class NewClass {
    public void newMethod() {
        System.out.println("This is a new method");
    }
}
```
#### Пояснение:
- Аннотация @Deprecated сообщает разработчикам, что метод oldMethod устарел и больше не рекомендуется для использования.
- Компилятор может генерировать предупреждения, если этот метод будет вызван.
3. Аннотация @SuppressWarnings:
```java
@SuppressWarnings("unchecked")
public class MyClass {
    public void myMethod() {
        List list = new ArrayList();
        list.add("Hello");
    }
}
```
#### Пояснение:
- Аннотация @SuppressWarnings("unchecked") подавляет предупреждения компилятора о неявном приведении типов, например, в случае использования необработанных типов в коллекциях.