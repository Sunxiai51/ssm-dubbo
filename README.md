# ssm-dubbo
本项目是为学习spring集成dubbo而搭建的，将一个简单的ssm项目拆分成了多个模块，以实现模块间通过dubbo的调用，包括以下模块：
* ssm-dubbo-core
* ssm-dubbo-interfaces
* ssm-dubbo-provider
* ssm-dubbo-consumer

## ssm-dubbo-core
包含一些除接口外的核心公共部分，例如实体类、工具类等。

## ssm-dubbo-interfaces
包含公共接口。

## ssm-dubbo-provider
包含service层与dao层，是公共接口的具体实现__(spring、myBatis)__。

## ssm-dubbo-consumer
包含controller与视图，通过调用公共接口以获取服务__(spring、springMVC)__。
