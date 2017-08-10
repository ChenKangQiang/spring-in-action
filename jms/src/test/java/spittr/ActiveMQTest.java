package spittr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.alerts.api.AlertService;
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

    @Autowired
    private AlertService alertService;


    @Test
    public void test() {
        Spittle spittle = new Spittle(100001L, null, "hello", new Date());
        producerService.sendMessage(spittle);

        Spittle receiveSpittle = consumerService.receive();
        System.out.println(receiveSpittle);
    }

    @Test
    public void test2() {
        Spittle spittle = new Spittle(100001L, null, "hello", new Date());
        alertService.sendSpittleAlert(spittle);

        Spittle receiveSpittle = alertService.retrieveSpittleAlert();
        System.out.println(receiveSpittle);
    }


}
