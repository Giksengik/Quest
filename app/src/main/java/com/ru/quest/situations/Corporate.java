package com.ru.quest.situations;

import com.ru.quest.situations.Decision;
import com.ru.quest.situations.ISituation;
import com.ru.quest.situations.SituationStatus;

import java.util.ArrayList;

public class Corporate implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,10,"Пойти на корпоратив");
        Decision secondDecision = new Decision(0, 20, 0,"Не пойти на корпоратив и заниматься своими делами");
        Decision thirdDecision = new Decision(0, 5, 0 , "Не пойти на корпоратив и отдыхать");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.ROUTINE1;
    }

    @Override
    public String getHistoryText() {
        return "Копроратив. Вы можете пойти на него, либо заниматься своими делами.";
    }

    @Override
    public String getHistoryTitle() {
        return "Корпоратив";
    }
}
