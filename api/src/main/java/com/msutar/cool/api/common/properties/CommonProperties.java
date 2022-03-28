package com.msutar.cool.api.common.properties;


import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@SpringBootConfiguration(proxyBeanMethods = false)
@ConfigurationProperties(prefix = CommonProperties.PROPERTIES_PREFIX)
public class CommonProperties {
    public static final String PROPERTIES_PREFIX = "cool-server";
    public static final String ENABLE_REDIS_CACHE = "cool-server.enable-redis-cache";

    private CaptchaProperties code = new CaptchaProperties();
    /**
     * 是否开启Redis缓存，true开启，false关闭
     * 为false时，采用基于内存的ehcache缓存
     */
    private boolean enableRedisCache;
}
