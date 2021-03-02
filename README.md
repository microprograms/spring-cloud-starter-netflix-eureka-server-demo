# Eureka 注册中心

- `默认端口：` 8761
- `默认注册地址：` http://localhost:8761/eureka/


#### 版本依赖
- `Jdk` 1.8 及以上
- `Spring Boot` 2.3.9.RELEASE
- `Spring Cloud` Hoxton.SR10


#### 编译打包

```shell
sh bin/package.sh
```

#### 启动

```shell
sh bin/start.sh
```

#### 查看控制台输出

```shell
tail -f server.nohup.out
```

#### 停止

```shell
sh bin/stop.sh
```
