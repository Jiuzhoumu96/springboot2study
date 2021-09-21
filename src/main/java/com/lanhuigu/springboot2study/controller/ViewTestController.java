package com.lanhuigu.springboot2study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jiuzhoumu
 * @date 2021/9/20 23:15
 */
@Controller
public class ViewTestController {
    
    private static final Logger log = LoggerFactory.getLogger(ViewTestController.class);
    
    @GetMapping("/atguigu")
    public String atguigu(Model model){
        model.addAttribute("msg","hello world");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
    
}
