package com.dokstudio.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 9:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Animal {

    @Id
    Integer AnimalId;

    String name;

    Integer age;

    String habitat;

    String food;

    String moveType;

    String deleted;

    Date createTime;

    Date updateTime;

}
