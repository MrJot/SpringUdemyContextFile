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
public class CricketCoach implements Coach{
    
    private FortuneService fortuneService;
    
    public CricketCoach(){
            System.out.println("We are in the middle of cricket match");
}
    
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "That is a long stick, you have";
    }

    @Override
    public String getDailyFortune() {
        return "Today cricket Fortune: "+ fortuneService.getFortune();
    }
    
}
