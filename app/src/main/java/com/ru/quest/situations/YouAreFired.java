package com.ru.quest.situations;

import java.util.ArrayList;

public class YouAreFired implements ISituation{

    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"Уволен");
        Decision secondDecision = new Decision(0,0,0,"Уволен");
        Decision thirdDecision = new Decision(0,0,0,"Уволен");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.YOU_ARE_FIRED;
    }

    @Override
    public String getHistoryText() {
        return "Вы много бездельничали и были уволены";
    }

    @Override
    public String getHistoryTitle() {
        return "Увольнение";
    }
}
