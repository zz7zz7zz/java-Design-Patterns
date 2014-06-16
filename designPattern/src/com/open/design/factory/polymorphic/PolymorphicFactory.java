package com.open.design.factory.polymorphic;

import com.open.design.factory.polymorphic.PolymorphicData.Car;

public class PolymorphicFactory {

	//1.抽象工厂角色： 这是工厂方法模式的核心，它与应用程序无关。是具体工厂角色必须实现的接口或者必须继承的父类。在java中它由抽象类或者接口来实现。
	public static abstract class CarFactory
	{
		abstract Car createCar();
	}	

	//2.具体工厂角色：它含有和具体业务逻辑有关的代码。由应用程序调用以创建对应的具体产品的对象。
	public static class SedanFactory extends CarFactory
	{
		public Car createCar()
		{
			return new PolymorphicData.Sedan();
		};
	}	
	
	public static class TrainFactory extends CarFactory
	{
		public Car createCar()
		{
			return new PolymorphicData.Train();
		};
	}	
	
	public static class BikeFactory extends CarFactory
	{
		public Car createCar()
		{
			return new PolymorphicData.Bike();
		};
	}	
}
