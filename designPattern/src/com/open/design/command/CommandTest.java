package com.open.design.command;

import com.open.design.command.CommandDef.Command;
import com.open.design.command.CommandDef.ConcreteCommand;
import com.open.design.command.CommandDef.Invoker;
import com.open.design.command.CommandDef.Receiver;

public class CommandTest {

	public static void main(String[] args) {
		//创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        //执行方法
        invoker.run();

	}

}
