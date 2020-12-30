package com.open.design.singleton;

/**
 * 属于饿汉式，静态初始化。
 * @author Administrator
 *
 */
public class Singleton5 {
    private static final Singleton5 instance;
 
    static {
        try {
            instance = new Singleton5();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }
 
    private Singleton5() {}
    
    public static Singleton5 getInstance() {
        return instance;
    }
}
