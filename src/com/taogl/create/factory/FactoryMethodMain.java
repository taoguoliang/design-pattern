package com.taogl.create.factory;

import com.taogl.create.factory.factory.AbstrctFactory;
import com.taogl.create.factory.factory.DataBaseLogFactory;
import com.taogl.create.factory.factory.FileLogFactory;
import com.taogl.create.factory.log.Log;

public class FactoryMethodMain {
    public static void main(String[] args) {
        //FileLogFactory
        AbstrctFactory fileLogFactory = new FileLogFactory();
        Log fileLog = fileLogFactory.createLog();
        fileLog.writeLog();

        //DataBaseLogFactory
        AbstrctFactory dataBaseLogFactory = new DataBaseLogFactory();
        Log dataBaseLog = dataBaseLogFactory.createLog();
        dataBaseLog.writeLog();
    }
}
