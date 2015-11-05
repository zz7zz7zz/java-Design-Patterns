package com.open.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * java 内置观察者模式
 * 
 * 缺点：
 * 1.Observale是一个类，必须设计一个类去继承它,如果一个类同时想继承Observale和另外一个超类，就会两难，比较Java不支持多重继承
 * 2.setChanged()方法被保护起来了(定义成了protected)，除非你继承自Observale，否则你无法创建Observale实例并组合到你自己的对象中来
 * @author Administrator
 *
 */
public class JavaUtilObserver {
	
	/**
	 * 被观察对象
	 * @author Administrator
	 *
	 */
	public static class DataObserveable extends Observable
	{
		public void notifyDataChange(Object message)
		{
			 setChanged();
			 notifyObservers(message);
		}
	}
	
	/**
	 * 观察者A
	 * @author Administrator
	 *
	 */
	public static class ObserverA implements Observer
	{
		Observable mObservable;
		
		public ObserverA(Observable mObservable) {
			super();
			this.mObservable = mObservable;
			this.mObservable.addObserver(this);
		}

		@Override
		public void update(Observable o, Object arg) {
			System.out.println("ObserverA arg:"+(arg instanceof String ? arg : ""));
		}
		
	}
	
	/**
	 * 观察者B
	 * @author Administrator
	 *
	 */
	public static class ObserverB implements Observer
	{
		Observable mObservable;
		
		public ObserverB(Observable mObservable) {
			super();
			this.mObservable = mObservable;
			this.mObservable.addObserver(this);
		}
		
		@Override
		public void update(Observable o, Object arg) {
			System.out.println("ObserverB arg:"+(arg instanceof String ? arg : ""));
		}
		
	}
}
