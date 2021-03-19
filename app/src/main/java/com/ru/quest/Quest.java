package com.ru.quest;

import com.ru.quest.situations.BeginningSituation;
import com.ru.quest.situations.ISituation;
import com.ru.quest.situations.SituationStatus;

import java.util.Map;

public class Quest {
    private static Quest instance;
    SituationFactory situationFactory;
    SituationStatus currentStatus;
    private GameCharacter gameCharacter;
    public static Quest getInstance() {
        if(instance == null){
            instance = new Quest();
        }
        return instance;
    }
    private Quest() {
        situationFactory = new SituationFactory();
    }
    public void startQuest(GameCharacter gameCharacter){
        this.gameCharacter = gameCharacter;
        currentStatus = SituationStatus.BEGINNING;
    }
    public ISituation getData() {
        return situationFactory.createSituation(gameCharacter, currentStatus);
    }
    public void newStage(SituationStatus status) {
        currentStatus = status;
    }

}
