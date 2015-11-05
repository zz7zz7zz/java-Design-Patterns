package com.open.design.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * 自定义观察者模式
 * @author Administrator
 *
 */
public class CustomObserver {

	 //被观察者,模仿Java内置观察者模式
	 public static class CustomObservable
	 {
		 /**
		     * 用来保存注册的观察者对象
		     */
		    private    List<IObserver> list = new ArrayList<IObserver>();
		    
		    /**
		     * 注册观察者对象
		     * @param observer    观察者对象
		     */
		    public void addObserver(IObserver observer){
		    	if (observer == null)
		            throw new NullPointerException();
		        if (!list.contains(observer)) {
		        	list.add(observer);
		        }
		    }
		    
		    /**
		     * 删除观察者对象
		     * @param observer    观察者对象
		     */
		    public synchronized void deleteObserver(Observer observer){
		        
		        list.remove(observer);
		    }
		    
		    /**
		     * 通知所有注册的观察者对象
		     */
		    public void nodifyObservers(Object arg){

		        Object[] arrLocal;
		        synchronized (this) {
		            arrLocal = list.toArray();
		        }
		        for (int i = arrLocal.length-1; i>=0; i--)
		            ((IObserver)arrLocal[i]).onUpdate(this, arg);
		    }
	 }

	 //观察者
	 public static interface IObserver {
		 void onUpdate(CustomObservable o, Object arg);
	 }
	 
	 /**
	 * 观察者A
	 * @author Administrator
	 *
	 */
	public static class CustomObserverA implements IObserver
	{
		@Override
		public void onUpdate(CustomObservable o, Object arg) {
			System.out.println("CustomObserverA arg:"+(arg instanceof String ? arg : ""));
			
		}
	}
	
	 /**
	 * 观察者B
	 * @author Administrator
	 *
	 */
	public static class CustomObserverB implements IObserver
	{
		@Override
		public void onUpdate(CustomObservable o, Object arg) {
			System.out.println("CustomObserverB arg:"+(arg instanceof String ? arg : ""));
			
		}
	}
}
