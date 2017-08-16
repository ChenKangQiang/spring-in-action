package edu.tongji.comm.spittr;

import edu.tongji.comm.spittr.api.SpittrService;
import edu.tongji.comm.spittr.service.impl.SpittrServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @Author chenkangqiang
 * @Data 2017/8/13
 * @Description
 */

@Configuration
public class RMIconfig {

    @Bean
    public RmiServiceExporter rmiServiceExporter(SpittrService spittrService) {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(spittrService);
        rmiServiceExporter.setServiceName("SpittrService");
        rmiServiceExporter.setServiceInterface(SpittrService.class);
        rmiServiceExporter.setRegistryHost("rmi.spitter.com");
        rmiServiceExporter.setRegistryPort(1199);
        return rmiServiceExporter;
    }

    @Bean
    public SpittrService spittrService() {
        SpittrService spittrService = new SpittrServiceImpl();
        return spittrService;
    }

}
