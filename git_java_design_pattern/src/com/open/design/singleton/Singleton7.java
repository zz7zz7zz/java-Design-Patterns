package com.open.design.singleton;

/**
 * 枚举写法
 * @author Administrator
 *
 */
public enum Singleton7 {
	INSTANCE;
	
	public static Singleton7 getInstance(){  
        return INSTANCE;  
    } 
}

