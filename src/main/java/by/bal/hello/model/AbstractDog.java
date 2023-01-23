package by.bal.hello.model;

public abstract class AbstractDog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }
    @Override
    public String makeSound() {
        return "Bark";
    }
}
