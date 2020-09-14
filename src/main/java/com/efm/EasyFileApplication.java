package com.efm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author gcc
 * @date 2020/8/24 11:50
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.efm.*.mapper")
public class EasyFileApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyFileApplication.class, args);
        System.out.println("============== 项目启动成功 ==============");
    }
}
