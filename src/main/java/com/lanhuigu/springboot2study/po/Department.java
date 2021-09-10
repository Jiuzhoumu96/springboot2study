package com.lanhuigu.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 16:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    Integer depId;

    String depName;

    String depAddress;

    String depFunction ;

    String personInCharge;

    String deleted;

    Date createTime;

    Date updateTime;

}
