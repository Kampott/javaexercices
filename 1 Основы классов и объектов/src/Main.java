interface Breathing {
    void breathe();
}

class Fish {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void eat() {
        System.out.println(name + " есть.");
    }
}

class Whale extends Fish implements Breathing {
    public Whale(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " дышет воздухом.");
    }
}

class Salmon extends Fish {
    public Salmon(String name) {
        super(name);
    }

    // Лосось плавает, но не дышит воздухом
    public void swim() {
        System.out.println(getName() + " плавает.");
    }
}

public class Main {
    public static void main(String[] args) {
        Fish whale = new Whale("Whale");
        Fish salmon = new Salmon("Salmon");

        if (whale instanceof Breathing) {
            ((Breathing) whale).breathe();
        }

        if (salmon instanceof Salmon) {
            ((Salmon) salmon).swim();
        }

        whale.eat();
        salmon.eat();
    }
}