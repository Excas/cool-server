package com.msutar.cool.api.common.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.swagger")
public class SwaggerProperties {
    private Boolean enable;
    private String groupName;
    private String basePackage;
    private String version;
    private String title;
    private String description;
    private String contactName;
    private String contactEmail;
    private String contactUrl;
}
