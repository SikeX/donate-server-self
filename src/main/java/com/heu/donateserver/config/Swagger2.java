package com.heu.donateserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 标注当前类是一个启动类，即项目启动时就要去加载了
@EnableSwagger2
public class Swagger2 {

    @Bean  //把该组件添加到IOC容器中
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // Swagger2进行包扫描，扫描 controller，这里填写 controller 的文件夹全路径
                .apis(RequestHandlerSelectors.basePackage("com.heu.donateserver.web.DonateClassController"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring boot 测试使用 Swagger2 构建Restful API")
                .contact(new Contact("xxx","https://github.com/SikeX/donate-server",""))
                .description("api描述")
                .version("1.0")
                .build();
    }

}
