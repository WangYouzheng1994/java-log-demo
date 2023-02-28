### 多个实现的引用效果

https://www.slf4j.org/codes.html#multiple_bindings


> The warning emitted by SLF4J is just that, a warning. Even when multiple bindings are present, SLF4J will pick one logging framework/implementation and bind with it. The way SLF4J picks a binding is determined by the JVM and for all practical purposes should be considered random. As of version 1.6.6, SLF4J will name the framework/implementation class it is actually bound to.
> 
> 没有什么实际规律，取决于jvm
