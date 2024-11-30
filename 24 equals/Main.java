import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        // Проверка на равенство ссылок
        if (this == obj) {
            return true;
        }
        // Проверка на null и тип
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Приведение типа и сравнение полей
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 25);

        System.out.println("p1.equals(p2): " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3): " + p1.equals(p3)); // false
        System.out.println("p1.equals(null): " + p1.equals(null)); // false
    }
}
