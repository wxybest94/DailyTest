package com.seven.test.beanTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class AliyunBean {
    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;

        public Aliyun aliyun(){
            return Aliyun.options()
                    .setAppKey(appKey)
                    .setAppSecret(appSecret)
                    .setBucket(bucket)
                    .setEndPoint(endPoint)
                    .build();
    }
}
