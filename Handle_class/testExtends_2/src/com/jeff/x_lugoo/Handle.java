package com.jeff.x_lugoo;

public class Handle {

	public void sendMessage(Message message)
	{
		message.target = this;
		switchFunc(message);
		
	}
	
	public void handleMessage()
	{
		System.out.println("handle message");
	}
	
	public void switchFunc(Message message)
	{
		message.target.handleMessage();
	}
}
