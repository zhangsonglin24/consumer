package com.forest.consumer.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Forest
 * @date 2022/6/14 14:43
 */
@FeignClient(name = "provider", fallbackFactory = ProviderClient.ProviderClientFallbackFactory.class)
public interface ProviderClient {

    @GetMapping("/test/get")
    String getTest();

    @Slf4j
    @Component
    class ProviderClientFallbackFactory implements FallbackFactory<ProviderClient> {

        @Override
        public ProviderClient create(Throwable cause) {
            return new ProviderClient() {
                @Override
                public String getTest() {
                    return "get provider test method 执行降级逻辑！";
                }
            };
        }
    }
}
