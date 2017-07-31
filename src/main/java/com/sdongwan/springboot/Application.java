package com.sdongwan.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2017/7/28.
 */



//使用mybatis基于xml配置时，需要加上这个注解，不然会报错，基于注解进行配置时，则不需要加上这个配置
@MapperScan("com.sdongwan.springboot.mapper")
//这个启动类要放在一个文件夹下面，不然运行应用会报错,springboot会自动扫描包下的bean，并且注册；
@SpringBootApplication
public class Application {
    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

}
