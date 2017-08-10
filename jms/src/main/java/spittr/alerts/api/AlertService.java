package spittr.alerts.api;

import spittr.domain.Spittle;

public interface AlertService {

    /**
     * 当用户发布一条Spittle时，将消息推送给关注的人
     *
     * @param spittle
     */
    void sendSpittleAlert(Spittle spittle);

    /**
     * 接收他人发布的Spittle
     *
     * @return
     */
    Spittle retrieveSpittleAlert();

}
