package com.dokstudio.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name = "airplane")
public class Airplane extends Vehicle {

    @Id
    Integer airplaneId;

    String airplaneName;

    String airplaneType;

}
