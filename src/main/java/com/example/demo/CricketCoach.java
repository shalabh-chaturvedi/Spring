package com.example.demo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public CricketCoach() {
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String workout() {
        return "Batting practice for 1 hour..";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
