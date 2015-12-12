package com.open.design.factory;

import com.open.design.factory.PolymorphicData.Car;
import com.open.design.factory.PolymorphicFactory.BikeFactory;
import com.open.design.factory.PolymorphicFactory.CarFactory;
import com.open.design.factory.PolymorphicFactory.SedanFactory;
import com.open.design.factory.PolymorphicFactory.TrainFactory;

public class PolymorphicTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CarFactory factory=new SedanFactory();
		Car car =factory.createCar();
		car.printName();
		
		factory=new TrainFactory();
		car =factory.createCar();
		car.printName();
		
		factory=new BikeFactory();
		car =factory.createCar();
		car.printName();

	}

}
