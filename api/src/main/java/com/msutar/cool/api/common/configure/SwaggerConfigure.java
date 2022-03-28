package com.msutar.cool.api.common.configure;


import com.msutar.cool.api.common.properties.SwaggerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
@EnableConfigurationProperties(value = {SwaggerProperties.class})
public class SwaggerConfigure {

    SwaggerProperties swaggerProperties;

    @Autowired
    public void setSwaggerProperties(SwaggerProperties swaggerProperties) {
        this.swaggerProperties = swaggerProperties;
    }

    /**
     * API
     * @return
     */
    @Bean
    public Docket adminApi() {
        // OAS_30：区别于 V2，（OpenAPI Specification 的简称 OAS）
        return new Docket(
                // 使用 OpenAPI 3.0
                DocumentationType.OAS_30)
                .enable(swaggerProperties.getEnable())
                // API 信息
                .apiInfo(getAdminApiInfo())
                // API 分组
                .groupName(swaggerProperties.getGroupName())
                .select()
                // 对某个包的接口进行监听
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
                // 监听所有接口
                // .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * API 信息
     * @return
     */
    private ApiInfo getAdminApiInfo() {
        return new ApiInfoBuilder()
                // 文档标题
                .title(swaggerProperties.getTitle())
                // 文档描述
                .description(swaggerProperties.getDescription())
                // 联系人信息
                .contact(new Contact(swaggerProperties.getContactName(), swaggerProperties.getContactUrl(), swaggerProperties.getContactEmail()))
                // 文档版本
                .version(swaggerProperties.getVersion())
                .build();
    }
}