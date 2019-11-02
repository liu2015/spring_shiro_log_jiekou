package com.example.demo.controller.jsonController;

import com.alibaba.fastjson.JSON;
import com.example.demo.controller.TuserController;
import com.example.demo.entity.ResponsePram;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: demo1030
 * @Package: com.example.demo.controller.jsonController
 * @ClassName: jsonController
 * @Author: ZHY
 * @Description: ${description}
 * @Date: 2019/11/1 14:45
 * @Version: 1.0
 */
@Controller
@RequestMapping("/jsons-service")
public class jsonController {
    private final  static Logger logger= LoggerFactory.getLogger( TuserController.class );

    @RequestMapping(value="v2",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String erpRequest(@RequestBody String parms){
        System.out.println( "一下是接收方的内容" );
        System.out.println( parms );
        System.out.println( "这里已经接口接收到信息" );

        Map<String, ResponsePram> map=new HashMap<String, ResponsePram>();
        ResponsePram rp=new ResponsePram("100","测试成功");
        map.put("Response",rp);
        String json= JSON.toJSONString(map);
        System.out.println("接口返回"+json);
        logger.info("接口返回`````````"+json);

        return json;

    }


}
