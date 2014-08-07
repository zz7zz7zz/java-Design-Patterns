package com.open.design.proxy;

import com.open.design.proxy.ProxyData.PostProxy;
import com.open.design.proxy.ProxyData.RealPost;

public class ProxyTest {

	public static void main(String[] args) {
		//不需要执行额外方法的
		RealPost mPost=new RealPost();
		mPost.post();
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		//需要执行额外方法的
		PostProxy mPostProxy=new PostProxy(mPost);
		mPostProxy.post();
	}

}
