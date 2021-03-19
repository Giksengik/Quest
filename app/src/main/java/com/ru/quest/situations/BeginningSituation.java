package com.ru.quest.situations;

import com.ru.quest.situations.Decision;
import com.ru.quest.situations.ISituation;
import com.ru.quest.situations.SituationStatus;

import java.util.ArrayList;

public class BeginningSituation implements ISituation {
    @Override
    public ArrayList<Decision> getDecisions() {
        ArrayList<Decision> decisions = new ArrayList<>();
        Decision firstDecision = new Decision(0,0,0,"Приступить к работе");
        Decision secondDecision = new Decision(0,0,0,"Приступить к работе");
        Decision thirdDecision = new Decision(0,0,0,"Приступить к работе");
        decisions.add(firstDecision);
        decisions.add(secondDecision);
        decisions.add(thirdDecision);
        return  decisions;
    }

    @Override
    public SituationStatus getStatus() {
        return SituationStatus.START_OF_CARRIER;
    }

    @Override
    public String getHistoryText() {
        return "Вы устроились на работу в офис. Вы можете зарабатывать деньги, повышать уровень жизни и добиваться карьерного роста.";
    }

    @Override
    public String getHistoryTitle() {
        return "Начало каррьеры";
    }
}
