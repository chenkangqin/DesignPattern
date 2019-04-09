package proxy.statics.impl;

import proxy.statics.inteface.UserMapper;

public class UserImpl implements UserMapper {
    @Override
    public void insert() {
        System.out.println("插入用户");
    }
}
