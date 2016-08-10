package spring;

public class Foo3{

    //具体执行业务的方法
    public void listen(Object foo) {
        System.out.println("消费者 foo3 " + foo.toString());
    }
}