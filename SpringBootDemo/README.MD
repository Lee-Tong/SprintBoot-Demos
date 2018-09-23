### SpringBootDemo
框架要求功能： 
- 处理http/json 请求 
- 日志记录 
- 持久化 
- 数据源，事务控制 
- 定时任务 
- 视图模版

搭建环境： 
- 编译器：Eclipse 2018.9.22 
- Maven : maven3.5.2 
- JDK: java8
- 系统: Windows10
- 数据库: mysql5.7

CREATE TABLE `userinfo` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8

