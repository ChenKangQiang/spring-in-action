package spittr.alerts.api;

import spittr.domain.Spittle;

import javax.jms.Destination;

public interface ConsumerService {

    /**
     * 接收消息
     */
    Spittle receive();
}
