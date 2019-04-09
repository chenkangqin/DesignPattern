package proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicDemo {
    public static void main(String[] args){
        RealObject procyInterface = new RealObject();
        MyInvocationHandle myInvocationHandle  =new MyInvocationHandle(procyInterface);
        ProcyInterface procyInterface1 = (ProcyInterface)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{ProcyInterface.class}, myInvocationHandle);
        System.out.println(procyInterface1.getInt(1));
        System.out.println( procyInterface1.getString());
    }
}
