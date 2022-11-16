package com.telegram.bot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
  ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Api Documentation")
        .description("所有接口返回格式均为\n" +
            "{\"code\":1, \"msg\":\"\", \"data\":{}}\n" +
            "code 不为1 代表请求失败，将msg内的消息弹出展示\n" +
            "下列接口的 Response 均为 data 字段")
        .license("Apache 2.0")
        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html")
        .termsOfServiceUrl("")
        .version("1.0.0").build();
  }

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.withClassAnnotation(RequestMapping.class))
        .apis(RequestHandlerSelectors.basePackage("com.telegram.bot.controller"))
        .paths(PathSelectors.any())
        .build()
        .useDefaultResponseMessages(false)
        .apiInfo(apiInfo());
  }
}
