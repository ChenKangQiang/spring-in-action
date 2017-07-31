package spittr.alerts;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import spittr.domain.Spittle;


@Service
public class AlertServiceImpl implements AlertService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendSpittleAlert(Spittle spittle) {
        rabbitTemplate.convertAndSend("spittle.alert.exchange",
                "spittle.alerts",
                spittle);
    }

    @Override
    public Spittle retrieveSpittleAlert() {
        // TODO Auto-generated method stub
        Spittle spittle = (Spittle) rabbitTemplate.receiveAndConvert("spittle.alert.queue");
        return spittle;
    }


}
