package com.bdqn.gao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.dao")
public class GaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GaoApplication.class, args);
    }

}
