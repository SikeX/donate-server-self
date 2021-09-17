package com.heu.donateserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class})
@MapperScan("com.heu.donateserver.mapper")
public class DonateServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DonateServerApplication.class, args);
    }

}
