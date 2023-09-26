package com.example.demo.event;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationEvent;

@Log4j2
public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
        log.info("2我的事件");
    }
}
