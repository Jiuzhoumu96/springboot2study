package com.dokstudio.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 9:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
public class Car extends Vehicle {

    @Id
    Integer carId;

    String carName;

    String carType;

}
