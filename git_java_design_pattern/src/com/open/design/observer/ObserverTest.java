package com.open.design.observer;

import com.open.design.observer.CustomObserver.CustomObservable;
import com.open.design.observer.CustomObserver.CustomObserverA;
import com.open.design.observer.CustomObserver.CustomObserverB;
import com.open.design.observer.JavaUtilObserver.DataObserveable;
import com.open.design.observer.JavaUtilObserver.ObserverA;
import com.open.design.observer.JavaUtilObserver.ObserverB;

@SuppressWarnings("unused")
public class ObserverTest {
	
	public static void main(String[] args) {
		
		//1.使用JAVA对观察者模式的支持
		//创建被观察者对象
		DataObserveable mDataObserveable=new DataObserveable();
		
		 //创建观察者对象，并将被观察者对象登记
		ObserverA mObserverA=new ObserverA(mDataObserveable);
		ObserverB mObserverB=new ObserverB(mDataObserveable);
		
		 //给被观察者状态赋值
		mDataObserveable.notifyDataChange("1");
		mDataObserveable.notifyDataChange("2");
		
		//2.使用自定义观察者
		//创建被观察者对象
		CustomObservable mCustomObservable=new CustomObservable();
		
		 //创建观察者对象，并将被观察者对象登记
		CustomObserverA mCustomObserverA=new CustomObserverA();
		CustomObserverB mCustomObserverB=new CustomObserverB();
		mCustomObservable.addObserver(mCustomObserverA);
		mCustomObservable.addObserver(mCustomObserverB);
		
		//给被观察者状态赋值
		mCustomObservable.nodifyObservers("3");
		mCustomObservable.nodifyObservers("4");
	}
}
