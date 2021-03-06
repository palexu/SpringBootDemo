package top.palexu.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xujunyu on 2017/8/1.
 */

@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}