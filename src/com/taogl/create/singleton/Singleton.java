package com.taogl.create.singleton;

public class Singleton {
    private Singleton(){}

    /**
     * 唯一实例
     * 内存可见性：通俗来说就是，线程A对一个volatile变量的修改，对于其它线程来说是可见的，即线程每次获取volatile变量的值都是最新的。
     * https://www.cnblogs.com/chengxiao/p/6528109.html
     */
    private static volatile Singleton singleton = null;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
