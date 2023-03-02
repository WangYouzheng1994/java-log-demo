package com.example.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Test
    void contextLoads() {

        // 这里为了体现name或者说class的作用，他影响了layout中的类名还有自定义logger的匹配~
        Logger logger123 = LoggerFactory.getLogger("123");
        logger123.info("我是123123123logger");

        Logger logger = LoggerFactory.getLogger(SpringbootDemoApplicationTests.class);
        logger.info("123123123123");

        // lombok + slf4j
        log.error("123");


        // 因为有log4j2 to slf4j 测试一下
        org.apache.logging.log4j.Logger logger1 = LogManager.getLogger();
        logger1.info("啦啦啦啦啦绿 我是log4j2");

        // jul to slf4j
        Log juljuljul = LogFactory.getLog("juljuljul");
        juljuljul.info("噜啦噜啦嘞(～￣▽￣)～，我是jul");
    }

}
