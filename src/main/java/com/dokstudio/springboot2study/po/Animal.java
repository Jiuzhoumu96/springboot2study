package com.dokstudio.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 9:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    Integer animalId;

    String AnimalName;

    Integer animalAge;

    String animalHabitat;

    String animalFood;

    String animalMoveType;

    String deleted;

    Date createTime;

    Date updateTime;

}
