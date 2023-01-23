package by.bal.hello.model;

public abstract class AbstractDuck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }
    @Override
    public String makeSound() {
        return "Squeks";
    }
}
