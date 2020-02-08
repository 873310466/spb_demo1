package com.lemonfish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lemonfish.mapper")
public class Rusult2SpbApplication {

    public static void main(String[] args) {
        SpringApplication.run(Rusult2SpbApplication.class, args);
    }


}
