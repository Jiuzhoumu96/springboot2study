package com.lanhuigu.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 10:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    Integer vehicleId;

    String vehicleName;

    String runType;

    BigDecimal maxVelocity;

    String deleted;

    Date createTime;

    Date updateTime;

}
