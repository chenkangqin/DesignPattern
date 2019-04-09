package proxy.statics.UserProcy;

import proxy.statics.impl.UserImpl;
import proxy.statics.inteface.UserMapper;

public class UserProcy implements UserMapper {
    private UserMapper userMapper;
    public UserProcy(UserImpl impl){
        userMapper = impl;
    }
    @Override
    public void insert() {
        System.out.println("插入前");
        userMapper.insert();
        System.out.println("插入后");
    }
}
