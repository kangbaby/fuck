package com.home.spider.controller;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * index
 * Created by ALIENWARE on 2017/6/25.
 */
@RestController
@RequestMapping("/165")
public class ApiBaseController {

    @RequestMapping("/action")
    public String action() throws IOException {
        Connection connect = Jsoup.connect("http://www.baidu.com");
        Document document = connect.get();
        return document.outerHtml();
    }
}
