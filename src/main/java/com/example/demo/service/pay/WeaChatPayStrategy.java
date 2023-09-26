package com.example.demo.service.pay;

import org.springframework.stereotype.Component;

@Component("weaChatPayStrategy")
public class WeaChatPayStrategy implements PayStrategy {
    @Override
    public boolean pay() {
        System.out.println("正在进行微信支付逻辑");
        return true;
    }
}
