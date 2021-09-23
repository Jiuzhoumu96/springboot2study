package com.lanhuigu.springboot2study.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: HeChengyao
 * @date: 2021/7/21 11:20
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    String userName;
    String passWord;
}
