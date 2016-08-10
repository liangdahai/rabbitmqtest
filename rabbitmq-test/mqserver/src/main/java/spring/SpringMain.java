package spring;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.MyMessage;


public class SpringMain {
    public static void main(final String... args) throws Exception {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring/rabbitmq-context.xml");
        //RabbitMQ模板
      //  RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
          RabbitTemplate template = (RabbitTemplate) ctx.getBean("template");
        
        //发送消息
       
        //template.convertAndSend("amq1.fanout", msg1);
     //template.convertAndSend("test1.reply.queue","reply");
       //template.convertAndSend("test1.dead.queue","dead");
         MyMessage message = new MyMessage(null, "123");
        template.convertAndSend("clientQueue",message);
        //template.convertAndSend("myQueue3","myQueue3");
        //template.convertAndSend("myQueue2", "myQueue2");
      //template.convertAndSend("amq1.direct", "test1.reply.queue", "哈哈");
       // template.convertAndSend("amq1.direct", "test1.dead.queue", "呵呵");
        Thread.sleep(1000);// 休眠1秒
        ctx.close();
        ctx.destroy(); //容器销毁
    }
}
