package com.dokstudio.springboot2study.po;

import org.junit.jupiter.api.Test;

/**
 * @author: HeChengyao
 * @date: 2021/7/22 16:26
 */
public class AnimalTest {

    @Test
    public void function1(){

        Animal animal;
        animal=new Dog();
        animal=new Cat();

        if (animal instanceof Dog){
            System.out.println(">>>>>> The animal is a dog");
        }else {
            System.out.println(">>>>>> The animal is not a dog");
        }
        if (animal instanceof Cat){
            System.out.println(">>>>>> The animal is a cat");
        }else {
            System.out.println(">>>>>> The animal is not a cat");
        }
        if(animal instanceof Animal){
            System.out.println(">>>>>> The animal is an animal");
        }else {
            System.out.println(">>>>>> The animal is not an animal");
        }


    }

}
