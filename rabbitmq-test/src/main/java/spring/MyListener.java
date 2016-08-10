package spring;

import pojo.MyMessage;

public class MyListener {
	public void listen(String object){
		//MyMessage message = (MyMessage)object;
		//message.setId("这是id");
		System.out.println("消费者2：" + object);
	}
}
