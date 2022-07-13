package org.example.slf4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 现在使用的是slf4j的接口，但是是通过桥接器最终通过log4j进行实际输出。门面提供了统一接口，屏蔽了底层实现。也是面向对象的体现。
 *
 * <!-- slf4j 兼容 log4j 1.x 桥接-->
 *     <dependency>
 *       <groupId>org.slf4j</groupId>
 *       <artifactId>slf4j-reload4j</artifactId>
 *       <version>1.7.36</version>
 *     </dependency>
 *
 */
public class Slf4jLog4j2App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jLog4j2App.class);

        logger.info("slf4j + log4j");
        logger.debug("slf4j + log4j");
        logger.warn("slf4j + log4j");
    }
}
