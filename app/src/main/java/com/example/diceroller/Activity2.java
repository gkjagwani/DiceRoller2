package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Activity2 extends AppCompatActivity {
    EditText Dicebreakerinput;
    Button Cancel;
    Button Save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
         Dicebreakerinput = (EditText) findViewById(R.id.editText2);
        Cancel = (Button) findViewById(R.id.button4);
        Save = (Button) findViewById(R.id.button5);
    }
        Intent intent = getIntent();
    public void cancel(View view){
       Intent intent = getIntent();
        finish();
    }
    public void save(View view){
        Intent intent = getIntent();
        Intent intent1 = new Intent(this,Activity2.class);
        String question = Dicebreakerinput.getText().toString();
        intent1.putExtra(EXTRA_MESSAGE,question);
        finish();
    }
}
