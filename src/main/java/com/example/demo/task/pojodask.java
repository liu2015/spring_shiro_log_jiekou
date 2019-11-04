package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class pojodask {

    private static final Logger logger= LoggerFactory.getLogger(pojodask.class);


    @Scheduled(fixedRate = 1000)
    public void prjo_dask(){

        Date dd=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String ddw=simpleDateFormat.format(dd);


        logger.info("现在时间:"+ddw);
        System.out.println("执行定时");
    }

}
