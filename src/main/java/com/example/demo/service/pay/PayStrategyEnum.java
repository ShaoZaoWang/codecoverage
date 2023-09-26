package com.example.demo.service.pay;

public enum PayStrategyEnum {
    WECHAT_PAY("wechat","weaChatPayStrategy","微信支付"),
    ALIPAY("alipay","alipayStrategy","支付宝支付")
    ;

    /**
     * 支付策略code
     */
    private String code;

    /**
     * bean名称
     */
    private String className;

    /**
     * 信息
     */
    private String info;

    PayStrategyEnum(String code,String className,String info){
        this.code=code;
        this.className=className;
        this.info=info;
    }


    public String getCode() {
        return code;
    }

    public String getClassName() {
        return className;
    }

    public String getInfo() {
        return info;
    }
}
