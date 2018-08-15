package com.hyt.simon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//开发时用普通jar方式处理
@SpringBootApplication
@MapperScan("com.hyt.simon.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class SimonApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SimonApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(SimonApplication.class, args);
	}
}
