package com.taogl.create.factory.factory;

import com.taogl.create.factory.log.Log;
import com.taogl.create.factory.log.DataBaseLog;

public class DataBaseLogFactory extends AbstrctFactory {

    @Override
    public Log createLog() {
        System.out.println("数据库工厂生产数据库日志");
        return new DataBaseLog();
    }
}
