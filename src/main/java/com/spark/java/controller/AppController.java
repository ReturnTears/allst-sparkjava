package com.spark.java.controller;

import com.spark.java.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hutu
 * @since 2022-09-12 下午 03:14
 */
@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    AppService appService;

    @RequestMapping("/hello")
    public String getHello() {
        return appService.getHello();
    }
}
