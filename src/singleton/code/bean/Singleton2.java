package singleton.code.bean;

/**
 *  懒汉式 线程不安全
 */
public class Singleton2 {
    private static  Singleton2 singleton2;
    private Singleton2(){
        System.out.println("懒汉式线程不安全");
    }
    public static Singleton2 getInstance(){
        if(singleton2==null){
            //这里可能造成线程不安全。线程一执行到这里进入等待，线程2被调度。线程2实例化之后，线程1继续执行 再次实例化，出错
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
