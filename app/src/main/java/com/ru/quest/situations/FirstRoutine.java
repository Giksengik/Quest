package com.ru.quest.situations;

import java.util.ArrayList;

public class FirstRoutine implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(120,-25,20,"Выполнить работу в срок");
        Decision secondDecision = new Decision(0, 10, 0,"Выполнить лишь часть работы, остальное время посвятить себе");
        Decision thirdDecision = new Decision(-20, 5, -20 , "Ничего не делать");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.ROUTINE2;
    }

    @Override
    public String getHistoryText() {
        return "Начальник просит сделать отчёт к завтрашнему дню.Работы очень много, но если постараться, то можно выполнить её в срок.";
    }

    @Override
    public String getHistoryTitle() {
        return "Внезапный отчёт";
    }
}
