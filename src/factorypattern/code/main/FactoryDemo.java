package factorypattern.code.main;

import factorypattern.code.bean.Animal;
import factorypattern.code.factory.AnimalFactory;

public class FactoryDemo {
    public static void main(String[] args){
        AnimalFactory factory = new AnimalFactory();
        Animal cat = factory.getAnimalByName("cat");
        Animal dog = factory.getAnimalByName("dog");
        cat.say();
        dog.say();

        Animal cat1 = factory.getAnimalByClassName("factorypattern.code.bean.Cat");
        Animal dog1 = factory.getAnimalByClassName("factorypattern.code.bean.Dog");
        cat1.say();
        dog1.say();

        //异常
        Animal pig = factory.getAnimalByClassName("factorypattern.code.bean.Pig");
        pig.say();
    }
}
