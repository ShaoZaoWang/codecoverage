package com.example.demo.event;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class MyEventPublisher {
    @Autowired
    ApplicationContext applicationContext;

    public void publisher() {
        MyEvent myEvent = new MyEvent(this);
        applicationContext.publishEvent(myEvent);
        log.info("3发布事件");
    }
}
