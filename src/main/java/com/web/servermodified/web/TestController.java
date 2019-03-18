package com.web.servermodified.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shiyu
 * @Description
 * @create 2019-03-17 12:44
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/aa")
    public String test() {
        return "/index" ;
    }
}
