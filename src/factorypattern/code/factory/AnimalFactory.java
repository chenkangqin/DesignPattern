package factorypattern.code.factory;


import factorypattern.code.bean.Animal;
import factorypattern.code.bean.Cat;
import factorypattern.code.bean.Dog;

public class AnimalFactory {

    public Animal getAnimalByName(String name){
        if("".equals(name)||name==null){
            return null;
        }else if("dog".equalsIgnoreCase(name)){
            return new Dog();
        }else if("cat".equalsIgnoreCase(name)){
            return new Cat();
        }
        return null;
    }
    //通过反射获取实例
    public Animal getAnimalByClassName(String className){
        Animal animal = null;
        try {
             animal = (Animal)Class.forName(className).newInstance();
        }catch (Exception e){
            System.out.println("获取className实例对象问题。请检查日志");
            e.printStackTrace();
        }
        return animal;
    }
}
