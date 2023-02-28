slf4j 与 log4j、JUL、Logback的集成使用，核心表现为代码API使用Slf4j，底层为不同的日志框架输出。


https://www.slf4j.org/images/concrete-bindings.png

此章节主要是表现 slf4j的适配器与各个主流日志实现的集成，体现slf4j的门面优越性

#### 日志级别说明
> TRACE < DEBUG < INFO <  WARN < ERROR 
