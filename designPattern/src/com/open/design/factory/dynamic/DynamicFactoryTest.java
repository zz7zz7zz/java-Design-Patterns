package com.open.design.factory.dynamic;

import com.open.design.factory.dynamic.DynamicFactoryData.Car;



public class DynamicFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car=DynamicFactory.produce("com.open.design.factory.dynamic.DynamicFactoryData$Benz");
		car.printName();
	
		car=DynamicFactory.produce("com.open.design.factory.dynamic.DynamicFactoryData$BMW");
		car.printName();
		
		car=DynamicFactory.produce("com.open.design.factory.dynamic.DynamicFactoryData$Audi");
		car.printName();
		
		car=DynamicFactory.produce("com.open.design.factory.dynamic.DynamicFactoryData$Tesla");
		car.printName();
	}

}
