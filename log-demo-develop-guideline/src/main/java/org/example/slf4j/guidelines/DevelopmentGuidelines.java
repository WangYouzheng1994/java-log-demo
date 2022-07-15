package org.example.slf4j.guidelines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 日志框架的开发要求
 * @Author: WangYouzheng
 * @Date: 2022/7/15 11:27
 * @Version: V1.0
 */
public class DevelopmentGuidelines {
    // 通过slf4j 初始 logger对象
    private static final Logger logger = LoggerFactory.getLogger(DevelopmentGuidelines.class);


    public static void main(String[] args) {
        exception();
        case1();
        case2();
    }

    /**
     * 异常处理
     */
    public static void exception() {
        int i = 0;
        try {
            while (true) {
                i++;
                if (i == 5) {
                    throw new RuntimeException("okok");
                }
                if (i == 10) {
                    throw new RuntimeException("肯德基疯狂炸鸡");
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    /**
     * 占位符处理
     */
    public static void case1() {
        logger.info("hey, 我是业务数据信息：当前用户id{}, 用户名称{}，年龄：{}", "11", "张三", "99");
    }

    public static void case2() {
        if (logger.isDebugEnabled()) {
            logger.info("i am slf4j debugger");
        }
    }
}