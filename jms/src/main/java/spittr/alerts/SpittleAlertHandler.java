package spittr.alerts;

import spittr.domain.Spittle;

/**
 * 使用消息驱动Bean，实现异步消息接收
 *
 * @author chen
 */
public class SpittleAlertHandler {

    public void handleSpittleAlert(Spittle spittle) {
        System.out.println(spittle.getMessage());
    }

}
