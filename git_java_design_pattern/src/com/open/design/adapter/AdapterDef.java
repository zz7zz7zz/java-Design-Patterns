package com.open.design.adapter;


/*
 　　模式所涉及的角色有：

　　●　　目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。

　　●　　源(Adapee)角色：现在需要适配的接口。

　　●　　适配器(Adaper)角色：适配器类是本模式的核心。适配器把源接口转换成目标接口。显然，这一角色不可以是接口，而必须是具体类。

 */
/**
 *适配器，将一个接口转换成另外一个接口
 *装饰者，不改变接口，但加入责任
 *外观，让接口更简单 
 * @author Administrator
 *
 */
public class AdapterDef {
	
	public interface Target
	{
		void work220v();
	}
	
	//目标(Target)角色 ,高压交流电
	public static class VoltageHight implements Target
	{
		@Override
		public void work220v() {
			
			System.out.println("work220v!");
		}
		
	}
	
	//被适配器，源(Adapee)角色,低压直流电
	public static class Adaptee
	{
		public void work36v(){
			System.out.println("work36v!");
		}
	}
	
	//适配器(Adaper)角色
	public static class Adapter implements Target{
		
		private Adaptee adaptee ;

		public Adapter(Adaptee adaptee) {
			super();
			this.adaptee = adaptee;
		}

		@Override
		public void work220v() {
			this.adaptee.work36v();
		}
	}
	
}
