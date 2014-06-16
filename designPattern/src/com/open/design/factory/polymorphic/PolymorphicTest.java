package com.open.design.factory.polymorphic;

import com.open.design.factory.polymorphic.PolymorphicData.Car;
import com.open.design.factory.polymorphic.PolymorphicFactory.CarFactory;
import com.open.design.factory.polymorphic.PolymorphicFactory.SedanFactory;
import com.open.design.factory.polymorphic.PolymorphicFactory.TrainFactory;
import com.open.design.factory.polymorphic.PolymorphicFactory.BikeFactory;

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
