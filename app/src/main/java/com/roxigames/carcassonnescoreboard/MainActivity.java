package com.roxigames.carcassonnescoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public PlayerScores playerScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerScores = new PlayerScores(getApplicationContext());
    }

    public void onButtonClick(View view)
    {

       EditText edtTxt = findViewById(R.id.edtTxtName);

       TextView txtHello = findViewById(R.id.txtMessage);
       txtHello.setText("Hello " + edtTxt.getText().toString());

       Intent intent = new Intent(MainActivity.this, AddPlayer.class);
       startActivity(intent);
    }
}