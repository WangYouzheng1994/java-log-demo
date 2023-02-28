> 简单的Log4j, JUL, Logback的引入使用
> 使用各自的api进行日志调用


- jul是java 自带的日志
- log4j是许多年前流行的日志框架
- logback曾经是最强日志框架，提供了更多细粒度管控日志的能力，并且和slf4j无缝集成
- log4j2 在log4j的1.x和logback改良而来，目前最强的java 日志框架，并发能力极其优秀，无垃圾运行

#### 官网传送门
https://logback.qos.ch/manual/layouts.html

https://logging.apache.org/log4j/1.2/manual.html

https://logging.apache.org/log4j/2.x/index.html


#### log4j1.x 桥接到 log4j2
https://logging.apache.org/log4j/2.x/maven-artifacts.html
1. 去掉现有1.x版本依赖
2. 引入依赖
```
  <dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-1.2-api</artifactId>
    <version>2.20.0</version>
  </dependency> 
```
