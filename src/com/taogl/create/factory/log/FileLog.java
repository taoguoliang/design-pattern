package com.taogl.create.factory.log;

public class FileLog implements Log {
    @Override
    public void writeLog() {
        System.out.println("文件日志写日志");
    }
}
