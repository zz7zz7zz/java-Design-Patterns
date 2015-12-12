package com.open.design.singleton;

/**
 * 完全使用了Java虚拟机的机制进行同步保证，没有一个同步的关键字。
 * @author Administrator
 *
 */
public class Singleton6 {
	
	// Private constructor prevents instantiation from other classes
	private Singleton6() { }
 
	/**
	* SingletonHolder is loaded on the first execution of Singleton.getInstance() 
	* or the first access to SingletonHolder.INSTANCE, not before.
	*/
	private static class SingletonHolder { 
		public static final Singleton6 INSTANCE = new Singleton6();
	}
 
	public static Singleton6 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}

