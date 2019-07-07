package com.taogl.create.factory.log;

public class DataBaseLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("数据库日志写日志");
    }
}
