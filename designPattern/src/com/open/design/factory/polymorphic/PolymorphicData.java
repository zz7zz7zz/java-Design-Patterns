package com.open.design.factory.polymorphic;

public class PolymorphicData {
	
	
	//3.抽象产品角色：它是具体产品继承的父类或者是实现的接口。在java中一般有抽象类或者接口来实现。
	public interface Car
	{
		void printName();
	}
	
	
	//4.具体产品角色：具体工厂角色所创建的对象就是此角色的实例。在java中由具体的类来实现。
	public static class Sedan implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Sedan.");
		}
	}
	
	public static  class Train implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Train.");
		}
	}
	
	public static class Bike implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Bike.");
		}
	}
	
}









