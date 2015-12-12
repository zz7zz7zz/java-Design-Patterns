package com.open.design.command;

/*
 命令模式涉及到五个角色，它们分别是：

　　●　　客户端(Client)角色：创建一个具体命令(ConcreteCommand)对象并确定其接收者。

　　●　　命令(Command)角色：声明了一个给所有具体命令类的抽象接口。

　　●　　具体命令(ConcreteCommand)角色：定义一个接收者和行为之间的弱耦合；实现execute()方法，负责调用接收者的相应操作。execute()方法通常叫做执行方法。

　　●　　请求者(Invoker)角色：负责调用命令对象执行请求，相关的方法叫做行动方法。

　　●　　接收者(Receiver)角色：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 */
public class CommandDef {

	//抽象命令角色类
	public interface Command {
	    /**
	     * 执行方法
	     */
	    void execute();
	}
	
	//具体命令角色类
	public static class ConcreteCommand implements Command {
	    //持有相应的接收者对象
	    private Receiver receiver = null;
	    /**
	     * 构造方法
	     */
	    public ConcreteCommand(Receiver receiver){
	        this.receiver = receiver;
	    }
	    @Override
	    public void execute() {
	        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
	        receiver.action();
	    }

	}
	
	//接收者角色类
	public static class Receiver {
	    /**
	     * 真正执行命令相应的操作
	     */
	    public void action(){
	        System.out.println("我是真正的接收者，我在执行操作");
	    }
	}
	
	//请求者角色类
	public static class Invoker {
	    /**
	     * 持有命令对象
	     */
	    private Command command = null;
	    /**
	     * 构造方法
	     * @return 
	     */
	    public void setCommand(Command command){
	        this.command = command;
	    }
	    /**
	     * 行动方法
	     */
	    public void run(){
	        
	        command.execute();
	    }
	}
}
