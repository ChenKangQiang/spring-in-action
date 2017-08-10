package spittr.alerts.api;

import spittr.domain.Spittle;

import javax.jms.Destination;

public interface ProducerService {

    /**
     * 向指定队列发送消息
     */
    void sendMessage(Destination destination, Spittle spittle);

    /**
     * 向默认队列发送消息
     */
    void sendMessage(Spittle spittle);
}
