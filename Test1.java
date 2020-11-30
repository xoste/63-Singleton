package com.xoste.leon.test;

import com.xoste.leon.singleton.Singleton1;

/**
 * 饿汉式的测试
 * @author Xoste
 */
public class Test1 {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
