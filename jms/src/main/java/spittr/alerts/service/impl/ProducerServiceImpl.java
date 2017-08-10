package spittr.alerts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Service;
import spittr.alerts.api.ProducerService;
import spittr.domain.Spittle;

import javax.jms.Destination;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    @Qualifier("jmsTemplate")
    private JmsOperations jmsOperations;

    @Override
    public void sendMessage(Destination destination, Spittle spittle) {

    }

    @Override
    public void sendMessage(Spittle spittle) {
        jmsOperations.convertAndSend(spittle);
    }
}
