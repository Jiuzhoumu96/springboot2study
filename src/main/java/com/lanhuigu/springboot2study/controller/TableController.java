package com.lanhuigu.springboot2study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jiuzhoumu
 * @date 2021/9/21 19:23
 */
@Controller
public class TableController {
    
    @GetMapping("/basic_table")
    public String basic_table(){
        
        return "table/basic_table";
    }
    
    
}
