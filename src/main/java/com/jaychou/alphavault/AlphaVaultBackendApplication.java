package com.jaychou.alphavault;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.jaychou.alphavault.mapper")
public class AlphaVaultBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlphaVaultBackendApplication.class, args);
    }

}

