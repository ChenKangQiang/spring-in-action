package sia.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sia.knights.api.Knight;
import sia.knights.api.Quest;


@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() { return new SlayDragonQuest(stream()); }

    @Bean
    public FakePrintStream stream() { return new FakePrintStream(); }

}
