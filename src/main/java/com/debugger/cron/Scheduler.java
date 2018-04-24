package com.debugger.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
    @Scheduled(fixedRate = 5000)//每5秒执行一次
    public void update() throws Exception {



    }
}
