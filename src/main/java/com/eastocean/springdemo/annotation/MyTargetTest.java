package com.eastocean.springdemo.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description:
 * @Author: eastOcean
 * @Date:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTargetTest {
    boolean required() default true;
}
