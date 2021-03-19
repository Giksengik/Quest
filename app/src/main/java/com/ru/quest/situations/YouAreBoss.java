package com.ru.quest.situations;

import java.util.ArrayList;

public class YouAreBoss implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"БОСС");
        Decision secondDecision = new Decision(0,0,0,"БОСС");
        Decision thirdDecision = new Decision(0,0,0,"БОСС");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }
    @Override
    public SituationStatus getStatus() {
        return SituationStatus.YOU_ARE_BOSS;
    }
    @Override
    public String getHistoryText() {
        return "Начальство заметило вашего успехи в работе и повысило вас до руководящей должности";
    }
    @Override
    public String getHistoryTitle() {
        return "Босс";
    }
}
