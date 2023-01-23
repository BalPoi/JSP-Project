package by.bal.hello.model;

public abstract class AbstractBear implements Animal {
    @Override
    public String getAnimal() {
        return "Bear";
    }
    @Override
    public String makeSound() {
        return "Я тучка-тучка-тучка, а вовсе не медведь!";
    }

}
