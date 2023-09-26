package com.example.demo;

import com.example.demo.event.MyEventPublisher;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Log4j2
class DemoApplicationTests {
	@Resource
	MyEventPublisher myEventPublisher;

	@Test
	void contextLoads() {
	}

	@Test
	public void publisher() {
		log.info("1发布事件");
		myEventPublisher.publisher();
	}

}
