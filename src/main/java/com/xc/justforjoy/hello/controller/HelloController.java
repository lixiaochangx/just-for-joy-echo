package com.xc.justforjoy.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lxcecho
 * @since 2020/7/19
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "index";
    }

}
