package com.example.log4j2demo;

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
        logger123.info("我是123123123logger info");
        logger123.trace("我是123123123logger trace");

        Logger logger = LoggerFactory.getLogger(SpringbootDemoApplicationTests.class);
        logger.info("123123123123");
        logger.trace("123123123123 trace");

        // lombok + slf4j
        log.error("123");
        log.trace("123trace");


        // 因为有log4j2 to slf4j 测试一下
        org.apache.logging.log4j.Logger logger1 = LogManager.getLogger();
        logger1.info("啦啦啦啦啦绿 我是log4j2 info");
        logger1.trace("啦啦啦啦啦绿 我是log4j2 trace");

        // jul to slf4j
        Log juljuljul = LogFactory.getLog("juljuljul");
        juljuljul.info("噜啦噜啦嘞(～￣▽￣)～，我是jul");
        juljuljul.trace("噜啦噜啦嘞(～￣▽￣)～，我是jul");

        // log4j to slf4j
        org.apache.log4j.Logger logger4j = org.apache.log4j.LogManager.getLogger(SpringbootDemoApplicationTests.class);
        logger4j.info("log4j info");
        logger4j.warn("log4j warn");
        logger4j.debug("log4j debug");
    }

}
