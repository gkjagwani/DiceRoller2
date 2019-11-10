package com.example.diceroller;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    private TextView Congratulations;
    private TextView DisplayDiceNo;
    private  TextView DisplayCounter;
    private TextView DisplayQuestions;
    private TextView DisplayInstruction;
    private EditText InputText;
    private Button ImLucky;
    private Button PlayDicebreaker;
    private Button AddDicebreaker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Congratulations = findViewById(R.id.textView3);
        DisplayDiceNo = findViewById(R.id.textView);
        DisplayCounter = findViewById(R.id.textView4);
        DisplayQuestions = findViewById(R.id.textView2);
        DisplayInstruction = findViewById(R.id.textView5);
        InputText = (EditText) findViewById(R.id.editText);
        ImLucky = (Button) findViewById(R.id.button);
        PlayDicebreaker = (Button) findViewById(R.id.button2);
        AddDicebreaker = (Button) findViewById(R.id.button3);


    }

    private ArrayList<String> Questions = new ArrayList<String>();
    private int count;

    private Random roll_the_dice(){
        Random random = new Random();
        return random;
    }

    public void FeelingLucky(View view) {
        int Input = Integer.parseInt(InputText.getText().toString());
        int DiceNo = roll_the_dice().nextInt(6)+1;

        if (DiceNo == Input) {
            switch (DiceNo) {
                case 1:
                    DisplayDiceNo.setText("1");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
                case 2:
                    DisplayDiceNo.setText("2");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
                case 3:
                    DisplayDiceNo.setText("3");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
                case 4:
                    DisplayDiceNo.setText("4");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
                case 5:
                    DisplayDiceNo.setText("5");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
                case 6:
                    DisplayDiceNo.setText("6");
                    count++;
                    Congratulations.setText("Congratulations you won!");
                    break;
            }
            DisplayCounter.setText("Wins:" + count);
        }
        else {
            switch(DiceNo){
                case 1: DisplayDiceNo.setText("1");
                    Congratulations.setText("Sorry you lose!");
                    break;
                case 2: DisplayDiceNo.setText("2");
                    Congratulations.setText("Sorry you lose!");
                    break;
                case 3: DisplayDiceNo.setText("3");
                    Congratulations.setText("Sorry you lose!");
                    break;
                case 4: DisplayDiceNo.setText("4");
                    Congratulations.setText("Sorry you lose!");
                    break;
                case 5: DisplayDiceNo.setText("5");
                    Congratulations.setText("Sorry you lose!");
                    break;
                case 6: DisplayDiceNo.setText("6");
                    Congratulations.setText("Sorry you lose!");
                    break;
            }
        }

    }
    public void PlayDiceBreaker (View view){
        Questions.add("If you could go anywhere in the world, where would you go?");
        Questions.add("If you were stranded on a desert island, what three things would you want to take with you?");
        Questions.add("If you could eat only one food for the rest of your life, what would that be?");
        Questions.add("If you won a million dollars, what is the first thing you would buy?");
        Questions.add("If you could spaned the day with one fictional character, who would it be?");
        Questions.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        int Input = roll_the_dice().nextInt(Questions.size());
        DisplayQuestions.setText(Questions.get(Input));
    }
    public void AddNewDiceBreaker(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        Intent intent1 = new Intent();

        String question = intent1.getStringExtra(EXTRA_MESSAGE);
        Questions.add(question);
    }





}

