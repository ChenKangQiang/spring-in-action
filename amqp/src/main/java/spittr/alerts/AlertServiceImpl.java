package spittr.alerts;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import spittr.domain.Spittle;

public class AlertServiceImpl implements AlertService {

  private RabbitTemplate rabbit;

  @Autowired
  public AlertServiceImpl(RabbitTemplate rabbit) {
    this.rabbit = rabbit;
  }
  
  @Override
  public void sendSpittleAlert(Spittle spittle) {
    rabbit.convertAndSend("spittle.alert.exchange", 
                          "spittle.alerts", 
                          spittle);
  }

	@Override
	public Spittle retrieveSpittleAlert() {
		// TODO Auto-generated method stub
		Spittle spittle = (Spittle)rabbit.receiveAndConvert("spittle.alert.queue");
		return spittle;
	}
  
  

}
