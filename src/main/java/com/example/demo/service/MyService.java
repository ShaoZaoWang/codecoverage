package com.example.demo.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class MyService implements CommandLineRunner {

    //@Async
    public String getOne() {
        System.out.println("current thread - " + Thread.currentThread().getName());
        return "成功";
    }

    @Override
    public void run(String... args) throws Exception { ;
        log.info("CommandLineRunner---");
    }
}
