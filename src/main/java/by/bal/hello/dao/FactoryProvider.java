package by.bal.hello.dao;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if("Black".equalsIgnoreCase(choice)){
            return new BlackAnimalFactory();
        }
        else if("Brown".equalsIgnoreCase(choice)){
            return new BrownAnimalFactory();
        }
        throw new RuntimeException("There is no such factory: " + choice);
    }
}
