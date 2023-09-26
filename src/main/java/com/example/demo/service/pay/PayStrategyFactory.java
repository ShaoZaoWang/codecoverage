package com.example.demo.service.pay;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

@Component
public class PayStrategyFactory {

    @Resource
    Map<String, PayStrategy> payStrategyMap;

    public PayStrategy getPayStrategy(PayStrategyEnum payStrategyEnum) {
        if (!payStrategyMap.containsKey(payStrategyEnum.getClassName())) {
            System.out.println("没有对应的支付类");
            return null;
        }
        return payStrategyMap.get(payStrategyEnum.getClassName());
    }
}
