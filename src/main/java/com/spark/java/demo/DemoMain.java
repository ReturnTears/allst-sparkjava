package com.spark.java.demo;

import io.xjar.boot.XBoot;

import java.io.File;

public class DemoMain {
    public static void main(String[] args) throws Exception {
        String password = "io.xjar";
        File plaintext = new File("D:\\IdeaProjects\\code\\admin\\server\\target\\admin-server.jar");
        File encrypted = new File("D:/TestData/encrypted.jar");
        XBoot.encrypt(plaintext, encrypted, password);
    }
}
