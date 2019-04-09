package factorypattern.code.bean;

/**
 * @author chenkq
 */
public class Dog implements Animal{

    @Override
    public void say() {
        System.out.println("Dog");
    }
}
