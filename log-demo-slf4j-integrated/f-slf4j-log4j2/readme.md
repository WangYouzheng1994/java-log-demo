#### Simple Logging Facade for Java (SLF4J)


> 此案例可以看到，使用的是slf4j api，但是底层用的都是log4j2的逻辑，包括配置文件

`https://www.slf4j.org/`

`
https://logging.apache.org/log4j/2.x/log4j-slf4j-impl.html
`

##### 依赖集成说明
> log4j-slf4j-impl should be used with SLF4J 1.7.x releases or older.  
log4j-slf4j2-impl should be used with SLF4J 2.0.x releases or newer.
> https://logging.apache.org/log4j/2.x/log4j-slf4j-impl.html
> https://logging.apache.org/log4j/2.x/runtime-dependencies.html
```
引入
<!--  引入log4j2门面 -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
</dependency>
<!--  引入log4j2 输出实现 -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
</dependency>

 <!--    引入log4j2 和 slf4j的集成    -->
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-slf4j-impl</artifactId>
</dependency>

<!--   引入slf4j门面     -->
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
</dependency>

```

#### 执行过程分析
> slf4j api门面，通过log4j-slf4j-impl进而 调用的是 log4j2的门面（log4j2-api）


#### 异步日志
> log4j2的最核心的亮点，也是因为异步日志的存在带来了极强的并发能力

##### 实现方式
- AsyncAppender
> 这种方式主要是引用别的Appendr来实现的，相当于数据中台中的sink
底层基于线程池
- AsyncLogger（无锁） 官方推荐
1. 全局异步，所有的log.xxx都是异步输出的
```
无需变配置文件，jvm加个参数就行了
```
2. 混合异步
> 混合异步的目的在于，不太重要的日志 可以用异步进行处理，但是一些敏感重要日志必须要同步执行
