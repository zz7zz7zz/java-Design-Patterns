package com.open.design.decorator;

import com.open.design.decorator.DecorateorDef.Boy;
import com.open.design.decorator.DecorateorDef.DecoratorA;
import com.open.design.decorator.DecorateorDef.DecoratorB;
import com.open.design.decorator.DecorateorDef.ISay;

public class DecorateorTest {

	public static void main(String[] args) {
		
		//写法一：
		ISay mISay=new Boy();
		
		DecoratorA mDecoratorA=new DecoratorA(mISay);
		DecoratorB mDecoratorB=new DecoratorB(mDecoratorA);
		
		mDecoratorB.say();
		
		//写法二：
		DecoratorB mDecorator =new DecoratorB(new DecoratorA(new Boy()));
		mDecorator.say();
	}

}
