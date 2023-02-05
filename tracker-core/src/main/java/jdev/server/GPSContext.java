package jdev.server;

import jdev.server.services.GPSService;
import jdev.server.services.MessagePeekService;
import jdev.server.services.MessageSendService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

@Configuration
@EnableScheduling
public class GPSContext {

    @Bean
    public GPSService gpsService() {
        return new GPSService();
    }

    @Bean
    public MessagePeekService messagePeekService() {
        return new MessagePeekService();
    }
    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService();
    }
    @Bean
    public TaskScheduler poolScheduler() {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setThreadNamePrefix("poolScheduler");
        scheduler.setPoolSize(20);
        return scheduler;
    }
}
