package com.atguigu.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1、配置整合dubbo
 *      1.dubbo的 starter 依赖
 *      2.dubbo的配置文件
 *      3.使用 @EnableDubbo 注解
 * 2、配置整合MyBatisPlus
 *      1.引入mybatisplus的starter依赖
 *      2.数据源
 *      3.添加 @MapperScan 注解，包扫描
 *
 * logstash整合，
 * 1）、导jar
 * 2）、导日志配置 logback-spring.xml
 * 3）、在kibana里面建立好日志的索引，就可以可视化检索
 *
 */
@EnableDubbo
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
