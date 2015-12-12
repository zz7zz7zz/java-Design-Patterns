package com.open.design.state;
/*
1.状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。

2.状态模式所涉及到的角色有：

　　●　　环境(Context)角色，也成上下文：定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。这个具体状态类的实例给出此环境对象的现有状态。

　　●　　抽象状态(State)角色：定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。

　　●　　具体状态(ConcreteState)角色：每一个具体状态类都实现了环境（Context）的一个状态所对应的行为。


3.注意平行线而不是平等性。
所谓平行性指的是各个状态的行为所处的层次是一样的，相互独立的、没有关联的，是根据不同的状态来决定到底走平行线的哪一条。行为是不同的，当然对应的实现也是不同的，相互之间是不可替换的。

而平等性强调的是可替换性，大家是同一行为的不同描述或实现，因此在同一个行为发生的时候，可以根据条件挑选任意一个实现来进行相应的处理。


4.大家可能会发现状态模式的结构和策略模式的结构完全一样，但是，它们的目的、实现、本质却是完全不一样的。
还有行为之间的特性也是状态模式和策略模式一个很重要的区别，状态模式的行为是平行性的，不可相互替换的；
而策略模式的行为是平等性的，是可以相互替换的。
 */
public class StateDef {

	//状态
	public interface State
	{
		public void next();
		public void prev();
	}
	
	//子状态
	public static class RedState implements State
	{
		private Context mContext;
		
		public RedState(Context mContext) {
			super();
			this.mContext = mContext;
		}

		@Override
		public void next() {
			System.out.println("I am RedState");
			mContext.setCurState(mContext.getYellowState());
		}

		@Override
		public void prev() {
			System.out.println("I am RedState");
			mContext.setCurState(mContext.getGreenState());
		}
		
	}

	//子状态
	public static class YellowState implements State
	{
		private Context mContext;
		
		public YellowState(Context mContext) {
			super();
			this.mContext = mContext;
		}
		@Override
		public void next() {
			System.out.println("I am YellowState");
			mContext.setCurState(mContext.getGreenState());
			
		}

		@Override
		public void prev() {
			System.out.println("I am YellowState");
			mContext.setCurState(mContext.getRedState());
			
		}
		
	}
	
	//子状态
	public static class GreenState implements State
	{
		private Context mContext;
		
		public GreenState(Context mContext) {
			super();
			this.mContext = mContext;
		}
		@Override
		public void next() {
			System.out.println("I am GreenState");
			mContext.setCurState(mContext.getRedState());
			
		}

		@Override
		public void prev() {
			System.out.println("I am GreenState");
			mContext.setCurState(mContext.getYellowState());
		}
		
	}
	
	//上下文
	public static class Context
	{
		private RedState redState 		= new RedState(this);
		private YellowState yellowState	= new YellowState(this);
		private GreenState greenState	= new GreenState(this);
		private State curState =redState;
		
		public RedState getRedState() {
			return redState;
		}
		public void setRedState(RedState redState) {
			this.redState = redState;
		}
		public YellowState getYellowState() {
			return yellowState;
		}
		public void setYellowState(YellowState yellowState) {
			this.yellowState = yellowState;
		}
		public GreenState getGreenState() {
			return greenState;
		}
		public void setGreenState(GreenState greenState) {
			this.greenState = greenState;
		}
		
		public State getCurState() {
			return curState;
		}
		public void setCurState(State curState) {
			this.curState = curState;
		}
		public void goNext()
		{
			curState.next();
		}
		
		public void goPrev()
		{
			curState.prev();
		}
	}
}
