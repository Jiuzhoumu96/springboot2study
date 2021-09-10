package com.lanhuigu.springboot2study.service.impl;

import com.lanhuigu.springboot2study.service.DogService;
import org.springframework.stereotype.Service;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 15:46
 */
@Service
public class DogServiceImpl implements DogService {

    @Override
    public Boolean finDog(String dogId) {
        if ("" != dogId && !("").equals(dogId)) {
            if (("shinubi").equals(dogId)) {
                return true;
            }
        }
        return false;
    }
}
