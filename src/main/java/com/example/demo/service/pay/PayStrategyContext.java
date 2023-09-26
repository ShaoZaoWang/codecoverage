package com.example.demo.service.pay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class PayStrategyContext {
    @Autowired
    private PayStrategyFactory payStrategyFactory;

    /**
     * 支付执行
     * @param payDTO 支付参数
     * @return
     */
    public boolean payHandle(PayDTO payDTO){

        //将某属性的值转换成具体的枚举。这里是根据payDTO的type字段对应枚举的code进行转换
        Optional<PayStrategyEnum> payStrategyEnumOptional = Arrays.stream(PayStrategyEnum.class.getEnumConstants())
                .filter((e) -> e.getCode().equals(payDTO.getType())).findAny();

        if(!payStrategyEnumOptional.isPresent()){
            System.out.println("匹配不到具体支付策略");
            return false;
        }
        PayStrategyEnum payStrategyEnum = payStrategyEnumOptional.get();

        PayStrategy payStrategy = payStrategyFactory.getPayStrategy(payStrategyEnum);

        //进行payDto参数的处理.....

        boolean pay = payStrategy.pay();

        //支付后的记录处理..


        return true;

    }
}
