package com.lanhuigu.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 9:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dog")
public class Dog extends Animal {

    @Id
    Integer dogId;

    String dogName;

    String AnimalType;

}
