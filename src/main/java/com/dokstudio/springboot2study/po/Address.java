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
 * @date: 2021/7/20 16:22
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {

    @Id
    Integer addressId;

    String CountryName;

    String provinceName;

    String cityName;

    String districtName;

    String streetName;

    String yardNo;

    String deleted;

    Date createTime;

    Date updateTime;

}
