package org.sql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.sql.dao")
public class SqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqlApplication.class, args);
    }

}