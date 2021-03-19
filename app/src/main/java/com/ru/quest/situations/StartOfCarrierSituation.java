package com.ru.quest.situations;

import java.util.ArrayList;

public class StartOfCarrierSituation implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(100,-10,15,"Выполнить работу усердно");
        Decision secondDecision = new Decision(-30, 0, -5,"Отдыхать");
        Decision thirdDecision = new Decision(20, 15, 0 , "Выполнить работу, свободное время уделить хобби");
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
        return "Вы начали свою работу. Начальник дал вам разребать кучу бумажек.Что будем делать?";
    }

    @Override
    public String getHistoryTitle() {
        return "Начало каррьеры";
    }
}
