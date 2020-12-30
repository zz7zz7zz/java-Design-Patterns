package com.open.design.proxy;

import com.open.design.proxy.ProxyDef.PostProxy;
import com.open.design.proxy.ProxyDef.PostProxy2;
import com.open.design.proxy.ProxyDef.RealPost;

public class ProxyTest {

	public static void main(String[] args) {
		//不需要执行额外方法的
		RealPost mPost=new RealPost();
		mPost.post();
		
		System.out.println();
		System.out.println("--------------A---------------");
		System.out.println();
		
		//需要执行额外方法的
		PostProxy mPostProxy=new PostProxy(mPost);
		mPostProxy.post();
		
		System.out.println();
		System.out.println("--------------B---------------");
		System.out.println();
		
		//需要执行额外方法的
		PostProxy2 mPostProxy2=new PostProxy2();
		mPostProxy2.post();
	}

}
