package com.open.design.state;

import com.open.design.state.StateDef.Context;

/**
 * 模拟红绿灯的例子
 * @author Administrator
 *
 */
public class StateTest {


	public static void main(String[] args) {
		Context mContext=new Context();
		mContext.goNext();
		mContext.goNext();
		
		mContext.goPrev();
		mContext.goPrev();
		mContext.goPrev();
	}

}
