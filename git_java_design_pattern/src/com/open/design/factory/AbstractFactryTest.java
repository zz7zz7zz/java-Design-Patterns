package com.open.design.factory;

import com.open.design.factory.AbstractFactry.AbsDream;
import com.open.design.factory.AbstractFactryCar.Car;
import com.open.design.factory.AbstractFactryHouse.House;

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
		System.out.println();
		
		//-------------------
		dream = new AbstractFactry.DreamBFactory();
		car =dream.createCar();
		house=dream.createHouse();
		
		car.printName();
		house.printHouseName();
		System.out.println();
		//-------------------
		dream = new AbstractFactry.DreamCFactory();
		car =dream.createCar();
		house=dream.createHouse();
		
		car.printName();
		house.printHouseName();
		

	}

}
