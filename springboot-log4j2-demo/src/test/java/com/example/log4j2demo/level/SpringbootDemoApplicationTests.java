package com.example.springbootdemo.level;

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
        log.info("info");
        log.debug("debug");
        log.warn("warning");
        log.error("error");
        log.trace("trace");
    }

}
