package com.open.design.factory;

import com.open.design.factory.SimpleFactoryData.Car;

public class SimpleFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car=SimpleFactory.produce("Benz");
		car.printName();
		
		car=SimpleFactory.produce("BMW");
		car.printName();
		
		car=SimpleFactory.produce("Audi");
		car.printName();
		
		car=SimpleFactory.produce("Tesla");
		car.printName();

	}

}
