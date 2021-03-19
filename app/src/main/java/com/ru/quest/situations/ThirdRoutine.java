package com.ru.quest.situations;

import java.util.ArrayList;

public class ThirdRoutine implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(50,-10,20,"Согласится и сделать мероприятие от души");
        Decision secondDecision = new Decision(-15, 5, -5,"Отказаться");
        Decision thirdDecision = new Decision(20, 15, 5 , "Согласится , сделать обычное мероприятие");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.CORPORATE;
    }

    @Override
    public String getHistoryText() {
        return "У офис менеджера очень много дел и он просит вам организовать мероприятие для сотрудинков офиса.";
    }

    @Override
    public String getHistoryTitle() {
        return "Мероприятие";
    }
}
