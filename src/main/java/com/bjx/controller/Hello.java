package com.bjx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bjx on 2017/4/16.
 */

@Controller("hello")
@RequestMapping("/hello")
public class Hello {

    private String prefix = "/WEB-INF/jsp" ;

    @RequestMapping("/helloJsp")
    public String helloJsp() {
       return prefix + "/hello.jsp";
    }
}
