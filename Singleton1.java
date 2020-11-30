package com.xoste.leon.singleton;

/**
 * 饿汉式-单例设计模式
 * @author Xoste
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();
    private Singleton1() {

    }
    public static Singleton1 getInstance() {
        return singleton1;
    }
}
