package com.spark.java.service.impl;

import com.spark.java.service.AppService;
import org.springframework.stereotype.Service;

/**
 * @author Hutu
 * @since 2022-09-12 下午 03:18
 */
@Service
public class AppServiceImpl implements AppService {
    @Override
    public String getHello() {
        return "Hello World ~";
    }
}
