package com.roxigames.carcassonnescoreboard;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class PlayerScores {

    int maxPlayers = 6;

    private ArrayList<Player> players = new ArrayList<Player>();
    private ArrayList<Move> moves = new ArrayList<Move>();

    private Move undoMove;

    private Context context;

    public PlayerScores(Context context)
    {
        this.context = context;
        LoadScores(this.context);
    }


    private void SaveScores(String data, @NonNull Context context)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("score.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

    private String LoadScores(Context context) {

        String ret = "";

        try {
            InputStream inputStream = context.openFileInput("score.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    stringBuilder.append("\n").append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("login activity", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("login activity", "Can not read file: " + e.toString());
        }

        return ret;
    }

    public void AddPlayer(String name, String color, int score)
    {
        Player newPlayer = new Player(name, color, score);
        players.add(newPlayer);
    }

    //public String[] AvalibleColors()
   // {

   // }

    //public void UndoMove()
   // {

    //}

    //public void RedoMove()
    // {

    //}

}
