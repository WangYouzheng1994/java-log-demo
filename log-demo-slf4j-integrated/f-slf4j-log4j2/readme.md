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
