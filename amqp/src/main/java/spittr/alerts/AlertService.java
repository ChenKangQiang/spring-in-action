package spittr.alerts;

import spittr.domain.Spittle;

public interface AlertService {

    /**
     * 发送消息到队列
     *
     * @param spittle
     */
    void sendSpittleAlert(Spittle spittle);

    /**
     * 从队列中接收消息
     *
     * @return
     */
    Spittle retrieveSpittleAlert();

}
