package by.bal.hello.dao;


import by.bal.hello.model.*;

public class BlackAnimalFactory implements AbstractFactory{
    @Override
    public AbstractDog createDog() {
        return new BlackDog();
    }

    @Override
    public AbstractDuck createDuck() {
        return new BlackDuck();
    }

    @Override
    public AbstractBear createBear() {
        return new BlackBear();
    }
}
