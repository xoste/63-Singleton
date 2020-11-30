package com.xoste.leon.singleton;

/**
 * 懒汉式-单例设计模式
 * @author Xoste
 */
public class Singleton {
    private static Singleton singleton;
    public Singleton() {

    }
    public static Singleton getInstance() {
        if (singleton == null) {
            // 多线程访问下，可能出现 if 同时成立的情况，要加锁
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
