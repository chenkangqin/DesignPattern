package singleton.code.bean;

/**
 * 懒汉式：线程安全
 */
public class Singleton3 {

    private static  Singleton3 singleton3;
    private Singleton3(){
        System.out.println("懒汉式线程安全");
    }
    //加锁 每次获取单例都加锁会有性能损耗，懒汉线程不安全只有在进入 ==null条件才存在，也就是没有实例化过的才会，所以方法锁性能不是很好
    public static synchronized Singleton3 getInstance(){
        if(singleton3==null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
