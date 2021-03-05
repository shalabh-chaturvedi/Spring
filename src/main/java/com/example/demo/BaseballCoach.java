package com.example.demo;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;
    private String email;
    private String team;

    public BaseballCoach() {
        System.out.println("BaseballCoach constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside baseball setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Inside Baseball coach setEmail");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside Baseball coach setTeam");
        this.team = team;
    }

    @Override
    public String workout() {
        return "Practice catch..";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
