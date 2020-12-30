package com.open.design.factory;

import java.lang.reflect.Constructor;

import com.open.design.factory.DynamicFactoryData.Car;



public class DynamicFactory {

	public static Car produce(String carName)
	{
		ClassLoader mClassLoader=DynamicFactory.class.getClassLoader();
		try {
			Class<?> mClass = mClassLoader.loadClass(carName);
			Constructor<?>[] mConstructor=mClass.getConstructors();
			return (Car) mConstructor[0].newInstance();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;	
	}

}
