package com.spark.java.demo;

import static spark.Spark.get;

/**
 * Spark 路由
 * get()方法映射 HTTP GET 请求的路由。
 */
public class HelloSpark {
    public static void main(String[] args) {
        /*
         * GET 请求。 当我们运行应用时，Spark 将启动嵌入式 Jetty Web 服务器。
         */
        get("/hello", (req, res) -> "Hello Spark");
        /*
         * 请求参数
         */
        get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));

    }
}
