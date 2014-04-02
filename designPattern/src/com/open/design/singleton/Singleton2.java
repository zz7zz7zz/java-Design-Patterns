package com.open.design.singleton;

/**
 *  懒汉式方式1
 * @author Administrator
 *
 */
public class Singleton2 {

	private static Singleton2 instance = null;
	 
	private Singleton2() {}
 
	public static Singleton2 getInstance() 
	{
		if (instance == null) 
		{
             instance = new Singleton2 ();
		}
		return instance;
	}

}
