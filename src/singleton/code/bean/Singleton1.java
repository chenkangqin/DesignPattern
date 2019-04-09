package singleton.code.bean;

/**
 * 饿汉式
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();
    private  Singleton1(){
        System.out.println("饿汉式单例");
    }
    public static Singleton1 getInstance(){
        return singleton1;
    }
    public void doSomething(){
        System.out.println("do some thing");
    }
}
