package spittr.alerts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Service;
import spittr.alerts.api.ConsumerService;
import spittr.domain.Spittle;

@Service
public class ConsumerServiceImpl implements ConsumerService {


    @Autowired
    @Qualifier("jmsTemplate")
    private JmsOperations jmsOperations;

    @Override
    public Spittle receive() {
        return (Spittle)jmsOperations.receiveAndConvert("spittle.alert.queue");
    }
}
