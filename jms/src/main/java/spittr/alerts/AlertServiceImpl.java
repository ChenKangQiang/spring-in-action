package spittr.alerts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;

import org.springframework.stereotype.Service;
import spittr.domain.Spittle;

/**
 * 使用JMS模板进行消息的发送和接收
 * JMS模板的缺点在于：接收消息属于同步接收，会阻塞
 * @author chen
 *
 */

@Service
public class AlertServiceImpl implements AlertService {

  @Autowired
  private JmsOperations jmsOperations;

  public AlertServiceImpl(JmsOperations jmsOperations) {
    this.jmsOperations = jmsOperations;
  }

//  public void sendSpittleAlert(final Spittle spittle) {
//    jmsOperations.send(
//      "spittle.alert.queue", 
//      new MessageCreator() {
//        public Message createMessage(Session session) 
//                       throws JMSException {
//          return session.createObjectMessage(spittle);
//        }
//      }
//    );
//  }

/*
  public void sendSpittleAlert(final Spittle spittle) {
    jmsOperations.send(
      new MessageCreator() {
        public Message createMessage(Session session) 
                       throws JMSException {
          return session.createObjectMessage(spittle);
        }
      }
    );
  }
*/
  
  @Override
  public void sendSpittleAlert(Spittle spittle) {
    jmsOperations.convertAndSend(spittle);
  }
  
//  public Spittle receiveSpittleAlert() {
//    try {
//    ObjectMessage message = (ObjectMessage) jmsOperations.receive();
//    return (Spittle) message.getObject();
//    } catch (JMSException e) {
//      throw JmsUtils.convertJmsAccessException(e);
//    }
//  }
  
  @Override
  public Spittle retrieveSpittleAlert() {
    return (Spittle) jmsOperations.receiveAndConvert();
  }

}
