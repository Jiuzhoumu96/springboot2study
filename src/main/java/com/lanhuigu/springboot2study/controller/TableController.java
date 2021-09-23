package com.lanhuigu.springboot2study.controller;

import com.lanhuigu.springboot2study.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jiuzhoumu
 * @date 2021/9/21 19:23
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model) {

        List<User> users = Arrays.asList(new User("yidaqi", "yidaqi123456"),
                new User("java", "java123456"),
                new User("zookeeper", "zookeeper123456"),
                new User("hadoop", "hadoop123456"),
                new User("kafka", "kafka123456"));
        model.addAttribute("users", users);
        return "table/dynamic_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }

    @GetMapping("/pricing_table")
    public String pricing_table() {
        return "table/pricing_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }


}
