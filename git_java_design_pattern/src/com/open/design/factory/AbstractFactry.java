package com.open.design.factory;

import com.open.design.factory.AbstractFactryCar.Car;
import com.open.design.factory.AbstractFactryHouse.House;

public class AbstractFactry {

	//抽象工厂类
	public static abstract class AbsDream
	{
		public abstract Car createCar();
		public abstract House createHouse();
	}

	
	//2.具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。
	public static class DreamAFactory extends AbsDream
	{
		public Car createCar()
		{
			return new AbstractFactryCar.Benz();
		};
		public House createHouse()
		{
			return new AbstractFactryHouse.TileRoofedHouse();
		};
	}
	
	public static class DreamBFactory extends AbsDream
	{
		public Car createCar()
		{
			return new AbstractFactryCar.Audi();
		};
		public House createHouse()
		{
			return new AbstractFactryHouse.CommodityHouse();
		};
	}
	
	public static class DreamCFactory extends AbsDream
	{
		public Car createCar()
		{
			return new AbstractFactryCar.Tesla();
		};
		public House createHouse()
		{
			return new AbstractFactryHouse.Villa();
		};
	}
}
