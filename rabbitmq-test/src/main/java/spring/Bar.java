package spring;

public class Bar{

    //具体执行业务的方法
    public void listen(String foo) {
        System.out.println("消费者 bar1 " + foo);
    }
}