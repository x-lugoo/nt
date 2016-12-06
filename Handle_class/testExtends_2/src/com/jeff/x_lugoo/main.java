package com.jeff.x_lugoo;

public class main {

	Handle handle  = new Handle(){
		public void handleMessage() {
			// TODO Auto-generated method stub
			System.out.println("second handle message");
		};
	};
	
	
	public static void main(String[] arg)
	{
		main m = new main();
		m.exe();
	}
	
	public void exe()
	{
		Message message = new Message();
		handle.sendMessage(message);
	}
	
	
}
