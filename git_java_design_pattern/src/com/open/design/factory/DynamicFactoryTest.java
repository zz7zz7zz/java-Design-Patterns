package com.open.design.factory;

import com.open.design.factory.DynamicFactoryData.Car;



public class DynamicFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car=DynamicFactory.produce("com.open.design.factory.DynamicFactoryData$Benz");
		car.printName();
	
		car=DynamicFactory.produce("com.open.design.factory.DynamicFactoryData$BMW");
		car.printName();
		
		car=DynamicFactory.produce("com.open.design.factory.DynamicFactoryData$Audi");
		car.printName();
		
		car=DynamicFactory.produce("com.open.design.factory.DynamicFactoryData$Tesla");
		car.printName();
	}

}
