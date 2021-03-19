package com.ru.quest.situations;

import java.util.ArrayList;

public class Depression implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"Депрессия");
        Decision secondDecision = new Decision(0,0,0,"Депрессия");
        Decision thirdDecision = new Decision(0,0,0,"Депрессия");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.DEPRESSION;
    }

    @Override
    public String getHistoryText() {
        return "Вы мало уделяли мало внимания своим интересам и вас постигла депрессия" ;
                }

    @Override
    public String getHistoryTitle() {
        return "Депрессия";
    }
}
