package com.example.demo.controller.jsonController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value="v2",method=RequestMethod.POST,produces="application/json;charset=UTF-8")
    @ResponseBody
    public String erpRequest(@RequestBody String parms){
        System.out.println( "一下是接收方的内容" );
        System.out.println( parms );
        System.out.println( "这里已经接口接收到信息" );
        return "成功";
    }


}
