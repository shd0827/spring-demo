package com.eastocean.springdemo.service;

import com.eastocean.springdemo.domain.service.FastJsonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description:
 * @Author: eastOcean
 * @Date:
 */
@SpringBootTest
public class FastJsonTest {
    @Autowired
    FastJsonService fastJsonService;
//    @Test
//    public void objectToString(){
//        fastJsonService.fastJson();
//    }
//    @Test
//    public void stringToObject(){
//        fastJsonService.stringToJson();
//    }
}
