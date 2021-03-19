package com.ru.quest.situations;

public class Decision {
    public int moneyReward;
    public int emotionReward;
    public int carrierReward;
    public String decisionTitle;
    public Decision(int moneyReward, int emotionReward, int carrierReward, String decisionTitle) {
        this.moneyReward = moneyReward;
        this.emotionReward = emotionReward;
        this.carrierReward = carrierReward;
        this.decisionTitle = decisionTitle;
    }
}
