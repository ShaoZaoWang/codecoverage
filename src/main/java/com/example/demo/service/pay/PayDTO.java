package com.example.demo.service.pay;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PayDTO {
    private String type;


    /**
     * 支付金额
     */
    private BigDecimal payMoney;

    /**
     * ...........
     */
}
