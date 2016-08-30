package com.dator;

import com.dator.service.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tanyi on 16/8/30.
 */
@RestController
@Slf4j
public class HelloController {


    @Autowired
    private UserInfo userInfo;

    @RequestMapping("/hello")
    public String home() {
        userInfo.setUserName("tanyi");
        userInfo.setUserId("2132");
        userInfo.setBoss("your self");
        log.info(userInfo.getUserName());
        log.info(userInfo.getBossInfo().getName());
        return "Hello World";
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
