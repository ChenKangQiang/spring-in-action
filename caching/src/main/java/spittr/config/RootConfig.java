package spittr.config;

// @import 可以导入其他的配置文件

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("spittr.db")
@Import({DataConfig.class, CachingConfig.class})
public class RootConfig {

}
