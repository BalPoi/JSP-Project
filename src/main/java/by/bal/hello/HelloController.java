package by.bal.hello;

import by.bal.hello.dao.AbstractFactory;
import by.bal.hello.dao.FactoryProvider;
import by.bal.hello.model.AbstractBear;
import by.bal.hello.model.AbstractDog;
import by.bal.hello.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {

        AbstractFactory animalFactory = FactoryProvider.getFactory("Black");

        AbstractDog dog = animalFactory.createDog();
        System.out.println(dog.getAnimal() + dog.getColor());
        System.out.println(dog.makeSound());

        AbstractBear bear = animalFactory.createBear();
        System.out.println(bear.getAnimal() + bear.getColor());
        System.out.println(bear.makeSound());

        return "hello_world";
    }
}
