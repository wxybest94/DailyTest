package com.seven.test.beanTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AliyunRun {

    @Autowired
    private AliyunBean aliyun;

    @RequestMapping("/aliyun")
    public String hello(){
        System.out.println(aliyun.aliyun().getAppKey());
        System.out.println(aliyun.aliyun().getAppSecret());
        System.out.println(aliyun.aliyun().getBucket());
        System.out.println(aliyun.aliyun().getEndPoint());
        return "hello";
    }

    public static void main(String[] args) {

    }
}
