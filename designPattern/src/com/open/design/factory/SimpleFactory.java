package com.open.design.factory;

import com.open.design.factory.SimpleFactoryData.Car;

//1.工厂类角色：这是本模式的核心，含有一定的商业逻辑和判断逻辑。在java中它往往由一个具体类实现
public class SimpleFactory {

	
	public static Car produce(String carName)
	{
		Car car=null;
		if("Benz".equals(carName))
		{	
			car=new SimpleFactoryData.Benz();
		}
		else if("BMW".equals(carName))
		{
			car=new SimpleFactoryData.BMW();
		}
		else if("Audi".equals(carName))
		{
			car=new SimpleFactoryData.Audi();
		}
		else if("Tesla".equals(carName))
		{
			car=new SimpleFactoryData.Tesla();
		}
		
		return car;	
	}
}
