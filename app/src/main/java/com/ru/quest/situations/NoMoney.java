package com.ru.quest.situations;

import java.util.ArrayList;

public class NoMoney implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"Нет денег");
        Decision secondDecision = new Decision(0,0,0,"Нет денег");
        Decision thirdDecision = new Decision(0,0,0,"Нет денег");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.NO_MONEY;
    }

    @Override
    public String getHistoryText() {
        return "У вас не осталось денег. Из-за этого вы не смогли продлить аренду жилья , что привело к увольнению с работы";
    }

    @Override
    public String getHistoryTitle() {
        return "Нет денег";
    }
}
