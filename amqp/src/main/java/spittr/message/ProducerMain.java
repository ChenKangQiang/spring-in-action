package spittr.message;

import java.time.LocalDateTime;

import org.junit.Ignore;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spittr.domain.Spittle;

@Ignore
public class ProducerMain {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/amqp-producer.xml");
        AmqpTemplate template = (AmqpTemplate) context.getBean("rabbitTemplate");

        for (int i = 0; i < 20; i++) {
            System.out.println("Sending message #" + i);
            Spittle spittle = new Spittle();
            spittle.setId(new Long(i));
            spittle.setMessage("Hello world (" + i + ")");
            spittle.setPostedTime(LocalDateTime.now());
            template.convertAndSend(spittle);
            Thread.sleep(2000);
        }

        System.out.println("Done!");

    }

}
