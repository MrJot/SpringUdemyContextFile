/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

/**
 *
 * @author w18154
 */
public class SadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is not your perfect day :-(";
    }
    
}
