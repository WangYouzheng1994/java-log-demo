package org.example.log4j2.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @Description: slf4j 使用log4j2桥接器  将log4j2转向slf4j  最后实际指向logback进行输出
 * @Author: WangYouzheng
 * @Date: 2022/7/13 15:11
 * @Version: V1.0
 */
public class Slf4jBridgeLog4jApp {
    public static void main(String[] args) {
        derived();
    }

    /**
     * slf4j Bridge 桥接log4J2
     */
    public static void derived() {

        /**
         * 假设 原有项目使用的是 Log4j API
         */
        Logger logger = LogManager.getLogger(Slf4jBridgeLog4jApp.class);

        logger.info("我是原生log4j--info");
        logger.warn("我是原生log4j--warn");
        logger.debug("我是原生log4j--debug");
        logger.error("我是原生log4j--error");
        logger.trace("我是原生log4j--trace");
        logger.fatal("我是原生log4j--fatal");
    }
}
