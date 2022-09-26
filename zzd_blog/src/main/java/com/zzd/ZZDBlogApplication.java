package com.zzd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zzd
 * @Description TODO
 * @Date 2022/9/24 22:13
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.zzd.mapper")
public class ZZDBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZZDBlogApplication.class,args);
    }
}
