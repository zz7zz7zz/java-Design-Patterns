package com.open.design.factory.abs;

import com.open.design.factory.abs.AbstractFactry.AbsDream;
import com.open.design.factory.abs.AbstractFactryCar.Car;
import com.open.design.factory.abs.AbstractFactryHouse.House;

public class AbstractFactryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbsDream dream = new AbstractFactry.DreamAFactory();
		Car car =dream.createCar();
		House house=dream.createHouse();
		
		car.printName();
		house.printHouseName();
		
		//-------------------
		dream = new AbstractFactry.DreamBFactory();
		car =dream.createCar();
		house=dream.createHouse();
		
		car.printName();
		house.printHouseName();
		
		//-------------------
		dream = new AbstractFactry.DreamCFactory();
		car =dream.createCar();
		house=dream.createHouse();
		
		car.printName();
		house.printHouseName();
		

	}

}
