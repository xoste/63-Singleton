package com.xoste.leon.test;

import com.xoste.leon.singleton.Singleton;

/**
 * 懒汉式的测试
 * @author Xoste
 */
public class Test {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
