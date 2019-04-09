package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandle implements InvocationHandler {
    private ProcyInterface procyObject;
    public MyInvocationHandle(ProcyInterface procyInterface){
        this.procyObject =  procyInterface;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理类，方法执行使用前");
        Object object2=method.invoke(procyObject,args);
        System.out.println("代理类，方法执行使用后");
        return object2;

    }
}
