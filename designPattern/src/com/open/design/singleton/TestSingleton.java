package com.open.design.singleton;

import java.lang.reflect.Constructor;

public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		testSingleton1();
		testSingleton2();
		testSingleton3();
		testSingleton4();
		testSingleton5();
		testSingleton6();
		testSingleton7();
	}
	
	public static void testSingleton1()
	{
		Singleton1 ins=Singleton1.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton1 ins2=null;//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton1");
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton1)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton1:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}

	public static void testSingleton2()
	{
		Singleton2 ins=Singleton2.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton2 ins2=null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton2");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton2)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton2:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
	
	public static void testSingleton3()
	{
		Singleton3 ins=Singleton3.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton3 ins2=null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton3");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton3)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton3:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
	
	public static void testSingleton4()
	{
		Singleton4 ins=Singleton4.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton4 ins2 =null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton4");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton4)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton4:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
	
	public static void testSingleton5()
	{
		Singleton5 ins=Singleton5.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton5 ins2=null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton5");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton5)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("testSingleton5:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
	
	public static void testSingleton6()
	{
		Singleton6 ins=Singleton6.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton6 ins2=null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton6");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton6)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton6:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
	
	public static void testSingleton7()
	{
		Singleton7 ins=Singleton7.getInstance();//得到第一个实例 
		System.out.println(ins);
		
		Singleton7 ins2=null;
		try {
			Class c = Class.forName("com.open.design.singleton.Singleton7");//用反射得到第二个实例,这里引用类的时候得写全路径，否则会报找不到类
			Constructor[] con = c.getDeclaredConstructors();
			Constructor conc = con[0]; 
			conc.setAccessible(true);
			ins2 = (Singleton7)conc.newInstance(); 
			System.out.println(ins2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("testSingleton7:"+(ins.equals(ins2)? "same":"diff"));
		System.out.println();
	}
}
