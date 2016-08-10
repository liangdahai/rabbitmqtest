package spring;

import pojo.MyMessage;

public class Foo2{

    //具体执行业务的方法
    public void listen(MyMessage foo) {
        System.out.println("消费者 foo2 " + foo.toString());
    }
}