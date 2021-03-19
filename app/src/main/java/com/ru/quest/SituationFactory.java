package com.ru.quest;

import com.ru.quest.situations.BeginningSituation;
import com.ru.quest.situations.Corporate;
import com.ru.quest.situations.Depression;
import com.ru.quest.situations.FirstRoutine;
import com.ru.quest.situations.ISituation;
import com.ru.quest.situations.NoMoney;
import com.ru.quest.situations.SecondRoutine;
import com.ru.quest.situations.SituationStatus;
import com.ru.quest.situations.StartOfCarrierSituation;
import com.ru.quest.situations.ThirdRoutine;
import com.ru.quest.situations.YouAreBoss;
import com.ru.quest.situations.YouAreFired;
import com.ru.quest.situations.YouFoundNewJob;

public class SituationFactory {
    public ISituation createSituation(GameCharacter character, SituationStatus status) {
        ISituation situation = null;
        if (character.carrier >= 100)  situation = new YouAreBoss();
        else if (character.emotion >= 100) situation = new YouFoundNewJob();
        else if (character.emotion <= 0)  situation = new Depression();
        else if (character.money <= 0)  situation = new NoMoney();
        else if (character.carrier <= 0) situation = new YouAreFired();
        else {
            switch (status) {
                case BEGINNING:
                    situation = new BeginningSituation();
                    break;
                case START_OF_CARRIER:
                    situation = new StartOfCarrierSituation();
                    break;
                case ROUTINE1:
                    situation = new FirstRoutine();
                    break;
                case ROUTINE2:
                    situation = new SecondRoutine();
                    break;
                case ROUTINE3:
                    situation = new ThirdRoutine();
                    break;
                case CORPORATE:
                    situation = new Corporate();
                    break;

            }
        }
        return situation;
    }
}
