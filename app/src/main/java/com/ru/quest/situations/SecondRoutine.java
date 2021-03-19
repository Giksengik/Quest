package com.ru.quest.situations;

import java.util.ArrayList;

public class SecondRoutine implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(20,10,3,"Выполнить работу , оставшее время заниматься самообразованием");
        Decision secondDecision = new Decision(0, 10, 0,"Играть в пасьянс");
        Decision thirdDecision = new Decision(100, -5, -15 , "Выполнить работу , после чего попросить ещё работу у начальника");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.ROUTINE3;
    }

    @Override
    public String getHistoryText() {
        return "Обычный рабочий день. Вам необходимо сделать некоторое количество работы.";
    }

    @Override
    public String getHistoryTitle() {
        return "Обычный день";
    }
}
