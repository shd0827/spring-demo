package com.eastocean.springdemo.domain.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: eastOcean
 * @Date:
 */
@Service
public class FastJsonService {
    public void fastJson(){
        Map<String,String> testMap = new HashMap<>();
        testMap.put("a", "123");
        testMap.put("b", "abc");
        String string = JSONObject.toJSONString(testMap);
        System.out.println("---------->" + string);
    }
    public void stringToJson(){
        String a = "{\"a\": \"dsfsd\", \"b\": 123}";
        JSONObject aObject = JSONObject.parseObject(a);
        aObject.put("d", "sdfsd");
        aObject.put("l", 123);
        aObject.put("a", 898);
        for(Object key : aObject.keySet()){
            Object b = aObject.get(key);
            System.out.println(b.getClass().toString());
            System.out.println(key + ":" + b);
        }
        System.out.println(aObject);
    }
}
