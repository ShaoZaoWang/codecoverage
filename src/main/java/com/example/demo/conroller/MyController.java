package com.example.demo.conroller;

import com.example.demo.service.MyService;
import com.example.demo.service.pay.PayDTO;
import com.example.demo.service.pay.PayStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/test")
    public String getOne() {
        Method[] methods = myService.getClass().getMethods();
        Async async = AnnotatedElementUtils.findMergedAnnotation(methods[0], Async.class);
        return myService.getOne();
    }

    @Autowired
    private PayStrategyContext payStrategyContext;

    @PostMapping
    public boolean pay(@RequestBody PayDTO payDTO){

        //这里因为懒。。就没有加上Service层了，直接在控制器处理
        return payStrategyContext.payHandle(payDTO);
    }

}
