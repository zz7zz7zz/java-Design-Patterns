package com.open.design.adapter;

import com.open.design.adapter.AdapterDef.Adaptee;
import com.open.design.adapter.AdapterDef.Adapter;
import com.open.design.adapter.AdapterDef.Target;
import com.open.design.adapter.AdapterDef.VoltageHight;


public class AdapterTest {

	public static void main(String[] args) {
		
		//非适配器
		VoltageHight mVoltageHight=new VoltageHight();
		mVoltageHight.work220v();
		
		System.out.println("---------------------");
		
		//适配器
		Target mTarget=new Adapter(new Adaptee());
		mTarget.work220v();

	}

}
