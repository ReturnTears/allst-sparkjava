package com.spark.java.demo;

import spark.servlet.SparkApplication;

import static spark.Spark.get;

/**
 * @author Hutu
 * @since 2022-09-12 下午 03:29
 */
public class HelloSpark2 implements SparkApplication {

    @Override
    public void init() {
        get("/hello2/:name", (request, response) -> "Hello " + request.params(":name"));
    }

    @Override
    public void destroy() {
        System.out.println("come in HelloSpark2 destroy。。。");
    }
}
