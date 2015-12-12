package com.open.design.adapter;

/*
 缺省适配(Default Adapter)模式为一个接口提供缺省实现，这样子类型可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。
 */
public class DefaultAdapterDef {
	
	public interface IEvent
	{
		void onTouch();
		void onDown();
		void onUp();
	}
	
	//缺省适配模式可以很好的处理这一情况。可以设计一个抽象的适配器类实现接口，此抽象类要给接口所要求的每一种方法都提供一个空的方法
	public abstract class IEventAdapter implements IEvent
	{

		@Override
		public void onTouch() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDown() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onUp() {
			// TODO Auto-generated method stub
			
		}
		
	}
}
