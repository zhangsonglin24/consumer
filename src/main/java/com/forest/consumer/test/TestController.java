package com.forest.consumer.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest
 * @date 2022/6/14 14:05
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/consumer")
public class TestController {

    private final TestService testService;

    @GetMapping("/get")
    public String test () {
        return testService.getTest();
    }
}
