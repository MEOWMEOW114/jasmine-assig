package com.jasmine.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
            .apis(RequestHandlerSelectors.any())
            .paths(PathSelectors.any())
            .build();
//            .apiInfo(apiInfo())
//            .useDefaultResponseMessages(false)
//            .globalResponseMessage(RequestMethod.GET, new ArrayList(new ResponseMessageBuilder().code(500)
//                .message("500 message")
//                .responseModel(new ModelRef("Error"))
//                .build(),
//                new ResponseMessageBuilder().code(403)
//                    .message("Forbidden!!!!!")
//                    .build()));
    }

//    private ApiInfo apiInfo() {
//        ApiInfo apiInfo = new ApiInfo("My REST API", "Some custom description of API.", "API TOS", "Terms of service", new Contact("John Doe", "www.example.com", "myeaddress@company.com"), "License of API", "API license URL", Collections.emptyList());
//        return apiInfo;
//    }
}