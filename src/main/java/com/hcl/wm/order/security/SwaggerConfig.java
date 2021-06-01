package com.hcl.wm.order.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean("orderApi")
    public Docket OrderApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.hcl.wm.order")).paths(PathSelectors.any())
                .build().apiInfo(metadata());
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("Order Service Swagger Configuration")
                .description("Swagger Configuration for application")
                .version("1.1.0")
                .license("Apache 2.0")
                .licenseUrl("http://localhost:9090/swagger-ui.html")
                .build();
    }
}

