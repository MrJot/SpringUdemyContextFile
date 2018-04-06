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
public class TrackCoach implements Coach  {
    
    private FortuneService fortuneService;
    
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    
    
    @Override
    public String getDailyWorkout() {
        return "Run for 5 km per day.";
    }

    @Override
    public String getDailyFortune() {
        return "Just DO IT "+ fortuneService.getFortune();
    }
    
}
