
## springboot 重新集成logj2
### 网上常见的方案1
1. 屏蔽当前springboot的日志框架
2. 引入log4j2和slf4j的适配
3. 桥接所有的日志给slf4j 再给 log4j2 （有些方案还不做这一步  很蠢。）
4. 测试~ 完美
### 方案2 
1. 屏蔽springboot中log4j2 桥接给slf4j
2. 增加log4j2和slf4j的适配

