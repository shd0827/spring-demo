package com.eastocean.springdemo.domain.service;

import com.eastocean.springdemo.annotation.MyTargetTest;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Description: test
 * @Author: eastOcean
 * @Date: 2019-12-17
 */
@Service
public class TestService {
    @MyTargetTest
    public void testAnnotation() throws NoSuchMethodException {
        Method method = TestService.class.getMethod("testAnnotation",null);
        if(method.isAnnotationPresent(MyTargetTest.class)){
            if(TestService.class.isAnnotationPresent(Service.class)){
                System.out.println("yes annotation present");
            }
            MyTargetTest targetTestAnnotation = method.getDeclaredAnnotation(MyTargetTest.class);
            boolean bol = targetTestAnnotation.required();
            System.out.println(bol);
        }
    }

}
