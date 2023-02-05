package jdev.server.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


@Service
public class MessagePeekService {
    private static final Logger log = LoggerFactory.getLogger(MessageSendService.class);

    @Autowired
    private GPSService gpsService;
    private BlockingDeque<String> queue =  new LinkedBlockingDeque<>(100);

    @Scheduled(fixedDelay = 2_000)
    void take() throws InterruptedException {
        log.info(queue.take());
        //System.out.println("Taking coords");
        //System.out.println((current - previous) + " ScheduledQueueService.take " + queue.poll(500, TimeUnit.MILLISECONDS));
        //System.out.println( "Current coordinates " + queue.take());
    }

    @Scheduled (fixedDelay = 2_000)
    void put() throws InterruptedException {
        //System.out.println("Putting coordinates ");
        queue.put(gpsService.getCoords());
        //System.out.println(queue);
    }

}
