package by.bal.hello.dao;

import by.bal.hello.model.*;

public class BrownAnimalFactory implements AbstractFactory{
    @Override
    public AbstractDog createDog() {
        return new BrownDog();
    }

    @Override
    public AbstractDuck createDuck() {
        return new BrownDuck();
    }

    @Override
    public AbstractBear createBear() {
        return new BrownBear();
    }
}
