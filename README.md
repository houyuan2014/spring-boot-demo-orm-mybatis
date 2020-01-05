# spring-boot-demo-orm-mybatis

> 此 demo 演示了 Spring Boot 如何与原生的 mybatis 整合，使用了 mybatis 官方提供的脚手架 `mybatis-spring-boot-starter `可以很容易的和 Spring Boot 整合。

> 此 demo 主要是演示如何使用 aop 切面对请求进行日志记录，并且记录 UserAgent 信息。

> 此 demo 主要演示了如何使用 logback 记录程序运行过程中的日志，以及如何配置 logback，可以同时生成控制台日志和文件日志记录，文件日志以日期和大小进行拆分生成。

> 此 demo 主要演示如何集成第三方的 swagger 来替换原生的 swagger，美化文档样式。本 demo 使用 [swagger-spring-boot-starter]
> 启动项目，访问地址：http://localhost:8080/demo/swagger-ui.html#/
> 用户名：xkcoding
> 密码：123456

## 参考

- Mybatis官方文档：http://www.mybatis.org/mybatis-3/zh/index.html

- Mybatis官方脚手架文档：http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/

- Mybatis整合Spring Boot官方demo：https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples

- swagger-spring-boot文档: https://github.com/battcn/swagger-spring-boot/blob/master/README.md

- swagger2 注解说明 ( @ApiImplicitParams ): https://blog.csdn.net/jiangyu1013/article/details/83107255

- xkcoding的gigthub: https://github.com/xkcoding/spring-boot-demo

## 开发环境
JDK 1.8 +
Maven 3.5 +
IntelliJ IDEA ULTIMATE 2018.2 + (注意：务必使用 IDEA 开发，同时保证安装 lombok 插件)
