package com.forest.consumer.test;

import com.forest.consumer.client.ProviderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Forest
 * @date 2022/6/14 15:00
 */
@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService{

    private final ProviderClient providerClient;

    @Override
    public String getTest() {
        return providerClient.getTest();
    }
}
