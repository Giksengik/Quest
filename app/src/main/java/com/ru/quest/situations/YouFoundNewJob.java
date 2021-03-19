package com.ru.quest.situations;

import java.util.ArrayList;

public class YouFoundNewJob implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"Новая работа");
        Decision secondDecision = new Decision(0, 0, 0,"Новая работа");
        Decision thirdDecision = new Decision(0, 0, 0 , "Новая работа");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.YOU_FOUND_NEW_JOB;
    }

    @Override
    public String getHistoryText() {
        return "Вы много времени уделяли делам, которые вам действительно нравились и нашли новую работу, на которой вам не скучно";
    }

    @Override
    public String getHistoryTitle() {
        return "Новая работа";
    }
}
