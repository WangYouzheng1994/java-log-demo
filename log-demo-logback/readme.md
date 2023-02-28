### Sfl4j曾经的的最佳实践 Logback
> https://logback.qos.ch/manual/configuration.html

1. 简介
> logback和log4j是同一个作者。Logback有三个模块core，classic，access
> 
> core是基础模块
> 
> classic是基于log4j进行优化出来的版本，并且他完全按照了slf4j的日志级别api进行了实现。
> 
> access是通过和servlet集成提供http查看日志的能力。现在其实有更多的方案了 比如elk，比如flume抽取到clickhouse

2. 组件
- logger，日志记录器，定义级别用的
- appender输出目标，比如控制台 ch.qos.logback.core.ConsoleAppender，file文件，
- layout，日志的输出格式化方式。 logback使用layout封装了encoder

3. 配置文件
- logback.groovy
- logback-test.xml
- logback.xml  
如果以上文件都不存在，就使用默认配置

4. 日志输出格式的占位符
> https://logback.qos.ch/manual/layouts.html
```
%-10level 级别
%d{yyyy-MM-dd HH:mm:ss.SSS}
%c 类名
%M 执行日志的方法
%L 行号
%thread 线程名字
%m 信息
$n
```
5. 日志级别
> TRACE < DEBUG < INFO <  WARN < ERROR

> 默认的日志级别是debug，因此不会打印Trace

6. 
