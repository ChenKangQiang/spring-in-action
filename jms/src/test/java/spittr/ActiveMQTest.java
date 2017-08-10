package spittr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.alerts.api.ConsumerService;
import spittr.alerts.api.ProducerService;
import spittr.domain.Spittle;

import java.util.Date;

/**
 * @Author chen
 * @Data 2017/8/8
 * @Description
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/messaging.xml"})
public class ActiveMQTest {

    @Autowired
    private ConsumerService consumerService;

    @Autowired
    private ProducerService producerService;


    @Test
    public void test() {
        System.out.println(consumerService);
        System.out.println(producerService);

        Spittle spittle = new Spittle(100001L, null, "hello", new Date());
        producerService.sendMessage(spittle);

        Spittle receiveSpittle = consumerService.receive();

        if (receiveSpittle != null) {
            System.out.println(receiveSpittle);
        }

    }


}
