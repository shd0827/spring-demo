package com.eastocean.springdemo.controller;

import com.eastocean.springdemo.domain.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: test
 * @Author: eastOcean
 * @Date: 2019-12-17
 */
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/annotation")
    public String testAnnotation(@RequestParam("id") String id) throws NoSuchMethodException {

        testService.testAnnotation();
        return id;
    }

}
