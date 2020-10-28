package com.geek.work02;

public class MyHttpClientTest {
    private final static String reqUrl = "http://www.hnit.edu.cn/";
    public static void main(String[] args) {
        System.out.println(MyHttpClient.get(reqUrl));
    }
}
