package com.ru.quest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ru.quest.situations.Decision;
import com.ru.quest.situations.ISituation;
import com.ru.quest.situations.SituationStatus;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView money;
    TextView carrier;
    ImageView emotions;
    TextView situationTitle;
    TextView history;
    Button firstButton;
    Button secondButton;
    Button thirdButton;
    GameCharacter gameCharacter;
    private void defineElements() {
        money = findViewById(R.id.moneyTextView);
        carrier = findViewById(R.id.carrierText);
        emotions = findViewById(R.id.emotionView);
        situationTitle = findViewById(R.id.eventTitle);
        history = findViewById(R.id.eventHistory);
        firstButton = findViewById(R.id.firstButton);
        secondButton = findViewById(R.id.secondButton);
        thirdButton =  findViewById(R.id.thirdButton);
    }
    private void chooseEmotion(GameCharacter gameCharacter) {
        if(gameCharacter.emotion >= 85){
            emotions.setImageResource(R.drawable.icon_very_happy);
        }else if(gameCharacter.emotion >= 60) emotions.setImageResource(R.drawable.icon_happy);
        else if(gameCharacter.emotion >= 40) emotions.setImageResource(R.drawable.icon_norm);
        else if(gameCharacter.emotion >= 20) emotions.setImageResource(R.drawable.icon_sad);
        else emotions.setImageResource(R.drawable.icon_very_sad);
    }
    @SuppressLint("SetTextI18n")
    private void updateUI(ISituation situation, GameCharacter gameCharacter){
        ArrayList<Decision> decisions = situation.getDecisions();
        firstButton.setText(decisions.get(0).decisionTitle);
        secondButton.setText(decisions.get(1).decisionTitle);
        thirdButton.setText(decisions.get(2).decisionTitle);
        chooseEmotion(gameCharacter);
        money.setText(gameCharacter.money+"");
        carrier.setText(gameCharacter.carrier+"");
        history.setText(situation.getHistoryText());
        situationTitle.setText(situation.getHistoryTitle());
    }
    private void defineButtonListeners(){
        firstButton.setOnClickListener(v -> {
            Decision decision = Quest.getInstance().getData().getDecisions().get(0);
            makeDecision(gameCharacter,decision);
            SituationStatus newStatus = Quest.getInstance().getData().getStatus();
            Quest.getInstance().newStage(newStatus);
            updateUI(Quest.getInstance().getData(),gameCharacter);
        });
        secondButton.setOnClickListener(v -> {
            Decision decision = Quest.getInstance().getData().getDecisions().get(1);
            makeDecision(gameCharacter,decision);
            SituationStatus newStatus = Quest.getInstance().getData().getStatus();
            Quest.getInstance().newStage(newStatus);
            updateUI(Quest.getInstance().getData(),gameCharacter);
        });
        thirdButton.setOnClickListener(v -> {
            Decision decision = Quest.getInstance().getData().getDecisions().get(2);
            makeDecision(gameCharacter,decision);
            SituationStatus newStatus = Quest.getInstance().getData().getStatus();
            Quest.getInstance().newStage(newStatus);
            updateUI(Quest.getInstance().getData(),gameCharacter);
        });
    }
    private void makeDecision(GameCharacter gameCharacter , Decision decision){
        gameCharacter.money += decision.moneyReward;
        gameCharacter.emotion += decision.emotionReward;
        gameCharacter.carrier += decision.carrierReward;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        defineElements();
        gameCharacter = new GameCharacter(100,40,30);
        Quest.getInstance().startQuest(gameCharacter);
        updateUI(Quest.getInstance().getData(),gameCharacter);
        defineButtonListeners();
    }
}