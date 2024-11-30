## Использование аннотации @Override
### Пример, где @Override помогает обнаружить ошибку:
```java
class Parent {
    void display() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    // Ошибка: метод не переопределяет метод суперкласса из-за неправильного написания
    @Override
    void disply() { // Ошибка компиляции: нет метода с таким именем в суперклассе
        System.out.println("Метод подкласса");
    }
}
```
-Если бы аннотация @Override не использовалась, компилятор не сообщил бы об ошибке, и disply считался бы новым методом в классе Child, а не переопределением метода display.

### Исправленный код:
```java
class Parent {
    void display() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    @Override
    void display() { // Правильное переопределение
        System.out.println("Метод подкласса");
    }
}
```

### @Override:
Аннотация `@Override` помогает обнаруживать ошибки в коде:
- Если метод в подклассе не совпадает с методом в суперклассе по имени или параметрам, компилятор выдаст ошибку.
- Без этой аннотации подобные ошибки могут остаться незамеченными, и метод будет считаться новым, а не переопределенным.