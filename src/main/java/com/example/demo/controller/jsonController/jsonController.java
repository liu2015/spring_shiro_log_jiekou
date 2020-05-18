package com.example.demo.controller.jsonController;


import com.example.demo.controller.TuserController;
import com.example.demo.entity.ResponsePram;
import com.google.gson.Gson;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
//@CrossOrigin(allowCredentials="true",maxAge = 3600) 2.0boot版本改动,要加入allowCredentials 默认是false 改称true
@CrossOrigin(origins = "*",maxAge = 3600) //解决跨域的问题的注释  * 代表任意,
@RequestMapping("/jsons-service")
public class jsonController {
    private final  static Logger logger= LoggerFactory.getLogger( TuserController.class );


    @RequestMapping(value="v2",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String erpRequest(@RequestBody String parms){
/**
 * @Method erpRequest
 * @Author os
 * @Version  1.0
 * @Description
 * @param parms
 * @Return java.lang.String
 * @Exception 
 * @Date 11/11/19 
 */

        System.out.println( "一下是接收方的内容" );
        System.out.println( parms );
        System.out.println( "这里已经接口接收到信息" );

        Map<String, ResponsePram> map=new HashMap<String, ResponsePram>();
        ResponsePram rp=new ResponsePram("100","测试成功");
        map.put("Response",rp);
        Gson gson=new Gson();
        String json= gson.toJson(map);
        System.out.println("接口返回"+json);
        logger.info("接口返回`````````"+json);

        return json;

    }


}
