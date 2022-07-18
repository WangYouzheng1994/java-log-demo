package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 配置文件指定某个宝的类的输出级别
 * @Author: WangYouzheng
 * @Date: 2022/7/18 12:09
 * @Version: V1.0
 */
public class LogbackSpecificLevelApp {
    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(LogbackDemoApp.class);

        // Logback配置文件的使用
        logger.trace("i am logback, {}", "its trace api");
        logger.debug("i am logback, {}", "its debug api");
        logger.info("i am logback, {}", "its info api");
        logger.warn("i am logback, {}", "its warn api");
        logger.error("i am logback, {}", "its error api");
    }
}
