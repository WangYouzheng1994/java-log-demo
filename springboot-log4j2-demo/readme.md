## SpringBoot工程的日志集成
1. springboot默认的日志门面是slf4j，使用logback作为日志实现
2. spring-boot-starter-logging 依赖中将 除了 logback以外的日志框架都桥接给了slf4j ，具体参见：https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging
#### test演示桥接是否正常
```
// 因为有log4j2 to slf4j 测试一下
org.apache.logging.log4j.Logger logger1 = LogManager.getLogger();
logger1.info("啦啦啦啦啦绿 我是log4j2");

// jul to slf4j
Log juljuljul = LogFactory.getLog("juljuljul");
juljuljul.info("噜啦噜啦嘞(～￣▽￣)～，我是jul");

```

#### 使用application.properties 简单的配置日志
https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging.custom-log-configuration
```
logging.level.root=info
logging.level.com.example.springbootdemo.level=error
logging.pattern.console=%d{yyyy-MM-dd} -%m %n

# 默认会在指定目录生成spring.log文件
logging.file.path=C:\\springboot-log
logging.file.name=xxx # 配置生成的日志文件名字
#logging.pattern.file= 用于配置输出到文件的那个格式化类型
```

#### springboot依然可以使用logback.xml，为了实现更高级的比如滚动日志的设置配置
https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.logging.custom-log-configuration
1. 使用logback.xml （spring不推荐）
> When possible, we recommend that you use the -spring variants for your logging configuration (for example, logback-spring.xml rather than logback.xml). If you use standard configuration locations, Spring cannot completely control log initialization.

2. 使用logback-spring.xml 才是标准的

## springboot 重新集成logj2
1. 屏蔽当前springboot的日志框架
2. 引入log4j2
3. 桥接所有的日志给slf4j 再给 log4j2
4. 测试~ 完美
