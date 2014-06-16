package com.open.design.factory.abs;


public class AbstractFactryHouse {
	
	
	//2.抽象产品角色：它一般是具体产品继承的父类或者实现的接口。在java中由接口或者抽象类来实现。
	public interface House
	{
		void printHouseName();
	}
	
	
	//3.具体产品角色：工厂类所创建的对象就是此角色的实例。在java中由一个具体类实现。
	public static class Villa implements House
	{
		@Override
		public void printHouseName() {
			System.out.println("i am Villa.");
		}
	}
	
	public static  class TileRoofedHouse implements House
	{
		@Override
		public void printHouseName() {
			System.out.println("i am TileRoofedHouse.");
		}
	}
	
	public static class CommodityHouse implements House
	{
		@Override
		public void printHouseName() {
			System.out.println("i am CommodityHouse.");
		}
	}
}

