package com.open.design.singleton;

/**
 * 饿汉式 简洁版（在多线程中效率低）
 * @author Administrator
 *
 */
public class Singleton3 {
	
		private static Singleton3 instance = null;
	 
		private Singleton3() {}
	 
		public static synchronized Singleton3 getInstance() 
		{
			if (instance == null) 
			{
	             instance = new Singleton3 ();
			}
			return instance;
		}
}

