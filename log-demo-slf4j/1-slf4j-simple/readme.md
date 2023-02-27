#### Simple Logging Facade for Java (SLF4J)

`https://www.slf4j.org/`

> 此案例可以看到，使用的是slf4j，但是底层用的都是log4j的逻辑，包括配置文件

##### 配置文件说明

```
引入
<groupId>org.slf4j</groupId>
    <artifactId>slf4j-reload4j</artifactId>
<version>1.7.36</version>

重点说明，根据官方要求 如果slf4j和log4j集成，需要引入此依赖。
log4j本身和slf4j以及logback是同一人

因此对于reload4j中 他还依赖了
<groupId>ch.qos.reload4j</groupId>
<artifactId>reload4j</artifactId>

因此，slf4j和log4j集成是不需要进行 显示的log4j依赖引入
```
