package com.dokstudio.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: HeChengyao
 * @date: 2021/7/20 9:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "human")
public class Human {

    @Id
    Integer humanId;

    String humanName;

    String skinColour;

    String age;

    String job;

    String sex;

    String address;

    String deleted;

    Date createTime;

    Date updateTime;

}
