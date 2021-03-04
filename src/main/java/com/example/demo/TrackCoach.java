package com.example.demo;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String workout() {
        return "Run for 5 kms..";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
