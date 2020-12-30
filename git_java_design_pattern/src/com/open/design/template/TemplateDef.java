package com.open.design.template;

public class TemplateDef {
	
	public static abstract class NetBase
	{
		//定义了一个算法骨架，将一些步骤延迟到子类.模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤
		public final void request()
		{
			doBuildData();//子类必须实现
			doSendData();//子类必须实现
			doReceData();//子类必须实现
			doHandleData();//子类必须实现
			
			doHookPrint();//钩子程序，默认什么都不做，子类视情况是否覆盖它
		}
		
		public abstract void doBuildData();
		public abstract void doSendData();
		public abstract void doReceData();
		public abstract void doHandleData();
		
		void doHookPrint(){};
	}
	
	//子类实现具体方法
	public static class NetImage extends NetBase
	{

		@Override
		public void doBuildData() {
			System.out.println("doBuildData");
		}

		@Override
		public void doSendData() {
			System.out.println("doSendData");
			
		}

		@Override
		public void doReceData() {
			System.out.println("doReceData");
			
		}

		@Override
		public void doHandleData() {
			System.out.println("doHandleData");
			
		}
		
	}
}
