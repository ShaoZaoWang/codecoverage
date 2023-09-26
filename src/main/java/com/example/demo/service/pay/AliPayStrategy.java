package com.example.demo.service.pay;

import org.springframework.stereotype.Component;

@Component("aliPayStrategy")
public class AliPayStrategy implements PayStrategy {
    @Override
    public boolean pay() {
        System.out.println("正在进行支付宝支付逻辑");
        return true;
    }
}
