package hus.oop.lab7.animal;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();

    public String toString() {
        return name;
    }
}
