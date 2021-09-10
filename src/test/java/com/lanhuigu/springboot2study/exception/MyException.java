package com.lanhuigu.springboot2study.exception;

import org.junit.jupiter.api.Test;

/**
 * @author: HeChengyao
 * @date: 2021/7/21 16:12
 */
public class MyException {

    @Test
    public void fun1() {

        MyException myException = new MyException();
        ErrorResponse errorResponse = new ErrorResponse();
        String sss = String.format("hhhhh{%s}hhhhhhhh%shhhhhhhhhh{}hhhhhhh", "asd", "asd");
        System.out.println(sss);
    }


}
