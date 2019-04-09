package proxy.statics;

import proxy.statics.UserProcy.UserProcy;
import proxy.statics.impl.UserImpl;
import proxy.statics.inteface.UserMapper;

public class StaticProcyDemo {
    public static void main(String[] args){
        UserMapper mapper = new UserProcy(new UserImpl());
        mapper.insert();
    }
}
