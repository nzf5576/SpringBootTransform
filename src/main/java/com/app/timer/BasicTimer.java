package com.app.timer;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BasicTimer {

    private static final Logger log = LoggerFactory.getLogger(BasicTimer.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 500000)
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(new Date()));
        System.out.println("The time is now {}"+ dateFormat.format(new Date()));
    }
}