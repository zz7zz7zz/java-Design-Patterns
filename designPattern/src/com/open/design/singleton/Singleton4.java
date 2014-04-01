package com.open.design.singleton;

/**
 * 静态初始化。
 * @author Administrator
 *
 */
public class Singleton4 {
    private static final Singleton4 instance;
 
    static {
        try {
            instance = new Singleton4();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }
 
    private Singleton4() {}
    
    public static Singleton4 getInstance() {
        return instance;
    }
}
