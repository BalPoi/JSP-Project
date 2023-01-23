package by.bal.hello.dao;

import by.bal.hello.model.AbstractBear;
import by.bal.hello.model.AbstractDog;
import by.bal.hello.model.AbstractDuck;

public interface AbstractFactory {
    AbstractDog createDog();
    AbstractDuck createDuck();
    AbstractBear createBear();
}
