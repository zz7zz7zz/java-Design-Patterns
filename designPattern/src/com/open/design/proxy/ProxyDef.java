package com.open.design.proxy;

public class ProxyDef
{
	
	//抽象角色：声明真实对象和代理对象的共同接口； 
	public interface IPost {
			void post();
	}

	//真实角色
	public static class RealPost implements IPost
	{
		public RealPost()
		{

		}
		
		@Override
		public void post() {
			System.out.println("---我要寄快递---");
		}
	}
	
	//代理角色
	public static class PostProxy implements IPost{
		
			private IPost mIPost;
			
			public PostProxy(IPost mIPost)
			{
				this.mIPost=mIPost;
			}
			
			@Override
			public void post() {
				System.out.println("---Hi,快递公司为您服务---");
				this.mIPost.post();
				System.out.println("---Hi,你的快递已经帮您寄出---");
			}
	}
	
	//代理角色2
	public static class PostProxy2 implements IPost{
		
			private IPost mIPost;
			
			public PostProxy2()
			{
				this.mIPost=new RealPost();
			}
			
			@Override
			public void post() {
				System.out.println("---Hi,快递公司2 为您服务---");
				this.mIPost.post();
				System.out.println("---Hi,你的快递2 已经帮您寄出---");
			}
	}
}

