package com.leegive.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leegive on 11/10/2016.
 */
@RefreshScope
@RestController
public class IndexController {

    @Value("${hello}")
    private String hello = "Hello null";

    @RequestMapping("/")
    public String index(){
        return this.hello;
    }

}
