package proxy.dynamic;

public class RealObject implements ProcyInterface {
    @Override
    public int getInt(int a) {
        System.out.println("有参");
        return a;
    }

    @Override
    public String getString() {
        System.out.println("无参");
        return "no args";
    }
}
