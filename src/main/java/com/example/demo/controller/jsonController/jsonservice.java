package com.example.demo.controller.jsonController;

import com.example.demo.Utils.jsoncli;
import com.example.demo.entity.TUser;
import com.example.demo.service.impl.TuserServiceimpl;
import com.google.gson.Gson;
import org.apache.ibatis.annotations.SelectProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.provider.base.BaseSelectProvider;

import java.io.IOException;

@Controller
public class jsonservice {

    private  final static Logger logger= LoggerFactory.getLogger(jsonservice.class);

    @Autowired
    TuserServiceimpl tuserServiceimpl;

    @RequestMapping("/postone/{userId}")
    @ResponseBody
    @SelectProvider(type = BaseSelectProvider.class, method = "dynamicSQL")
    public String selectOne(@PathVariable String userId) throws IOException {
        /**
         * @Method selectOne
         * @Author os
         * @Version  1.0
         * @Description
         * @param userId
         * @Return java.lang.String
         * @Exception 
         * @Date 11/11/19 
         */

        TUser dd1= new TUser();
        dd1.setUserId(userId);

        TUser d= tuserServiceimpl.selectOne(dd1);
        Gson gson=new Gson();
       String dd= gson.toJson(d);
        jsoncli json=new jsoncli();
        String ww=json.run1(dd);
    logger.info("执行数据库的转换json"+dd);
    logger.info("执行输出"+ww);
        return ww;
    }
   // 推送方法
    public String selectonepost(String args){




        return null;
    }


}
