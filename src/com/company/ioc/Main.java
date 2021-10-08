package com.company.ioc;

import java.net.URLEncoder;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
        System.out.println("main");

        //base 64

        //url encoding
        Encoder encoder = new Encoder(new UrlEncoder());
        String result = encoder.encode(url);

//        URLEncoder urlEncoder = new UrlEncoder();
//        String urlResult = urlEncoder.encode(url);
        System.out.println(result);
    }
}
