package com.taogl.create.factory.factory;

import com.taogl.create.factory.log.Log;
import com.taogl.create.factory.log.FileLog;

public class FileLogFactory extends AbstrctFactory {
    @Override
    public Log createLog() {
        System.out.println("文件日志工厂生产文件日志");
        return new FileLog();
    }
}
