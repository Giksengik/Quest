package com.ru.quest.situations;
import java.util.ArrayList;


public interface ISituation {
    ArrayList<Decision> getDecisions();
    SituationStatus getStatus();
    String getHistoryText();
    String getHistoryTitle();
}
