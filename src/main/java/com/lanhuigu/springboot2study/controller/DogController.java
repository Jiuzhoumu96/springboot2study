package com.lanhuigu.springboot2study.controller;

import com.lanhuigu.springboot2study.po.Dog;
import com.lanhuigu.springboot2study.service.DogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 11:08
 */
@RestController
@RequestMapping("/dog")
public class DogController {

    @Autowired
    DogService dogService;
    private static final Logger LOGGER = LoggerFactory.getLogger(DogController.class);

    @GetMapping("/get")
    public void getDog(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String getDog = "";
        getDog = "12123126741125793678";
        System.out.println(">>>>> getDog = " + getDog);
        LOGGER.debug(">>>>> getDog = " + getDog);
        LOGGER.info(">>>>> getDog = " + getDog);
        response.sendRedirect("/dog/find");
    }

    @GetMapping("/find/{dogId}")
    public String findDog(@PathVariable("dogId") String dogId) throws Exception {

        Dog dog=new Dog();
        String findDog = "";
        findDog = "fbawnbaewkjfnck";
        System.out.println(">>>>> findDog = " + findDog);
        LOGGER.debug(">>>>>>dogService.finDog(dogId)" + dogService.finDog(dogId));
        LOGGER.info(">>>>>>dogService.finDog(dogId)" + dogService.finDog(dogId));
        System.out.println(">>>>>>dogService.finDog(dogId)" + dogService.finDog(dogId));

        return findDog;
    }

    @GetMapping("/detail/{dogId}")
    public String detailDog(@PathVariable("dogId") String dogId) throws Exception {
        System.out.println(">>>>> dogId = " + dogId);
        LOGGER.debug(">>>>> dogId = " + dogId);
        LOGGER.info(">>>>> dogId = " + dogId);
        return dogId;
    }

}
