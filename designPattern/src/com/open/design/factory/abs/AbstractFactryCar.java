package com.open.design.factory.abs;


public interface AbstractFactryCar {
	
	
	//2.抽象产品角色：它一般是具体产品继承的父类或者实现的接口。在java中由接口或者抽象类来实现。
	public interface Car
	{
		void printName();
	}
	
	
	//3.具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。
	public static class Benz implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Benz.");
		}
	}
	
	public static  class BMW implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am BMW.");
		}
	}
	
	public static class Audi implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Audi.");
		}
	}
	
	public static class Tesla implements Car
	{
		@Override
		public void printName() {
			System.out.println("i am Tesla.");
		}
	}
}

