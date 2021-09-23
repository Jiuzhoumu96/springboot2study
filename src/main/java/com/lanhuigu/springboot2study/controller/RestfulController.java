package com.lanhuigu.springboot2study.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author: HeChengyao
 * @date: 2021/9/17 11:23
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class RestfulController {

    // @GetMapping("/car")
    @RequestMapping(value = "/car", method = RequestMethod.GET)
    public String getCar() {
        String result = "get";
        log.info("run method : {}", result);
        return result;
    }

    @PostMapping("/car")
    public String postCar() {
        String result = "post";
        log.info("run method : {}", result);
        return result;
    }

    @DeleteMapping("/car")
    public String deleteCar() {
        String result = "delete";
        log.info("run method : {}", result);
        return result;
    }

    @PatchMapping("/car")
    public String patchCar() {
        String result = "patch";
        log.info("run method : {}", result);
        return result;
    }

    @PutMapping("/car")
    public String putCar() {
        String result = "put";
        log.info("run method : {}", result);
        return result;
    }


}
