package test;

import org.springframework.stereotype.Component;

import pojo.MyMessage;


@Component
public class ItemMQHandle {

    public void execute(MyMessage msg) {
       //System.out.println(msg.toString() + "已送达新的ItemMQHandler");
       System.out.println(msg.toString() + "已送达新的ItemMQHandler");
    }
}
