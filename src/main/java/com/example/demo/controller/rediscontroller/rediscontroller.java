package com.example.demo.controller.rediscontroller;

import com.example.demo.Utils.redis.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller.rediscontroller
 * @ClassName: rediscontroller
 * @Author: os
 * @Description: qingqiu redis
 * @Date: 01/01/20 下午9:39
 * @Version: 1.0
 */
@Controller
@CrossOrigin
public class rediscontroller {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/redis/get")
    @ResponseBody
    public String redislist(@RequestBody String args){

        System.out.println(args);
        String key="liu";
        redisUtil.set(key,args);

        redisUtil.get(key);



        return (String) redisUtil.get(key);
    }

}
