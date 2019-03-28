package com.example.exercicio05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<Button, MainActivity.Posicao> posicoes = new HashMap<>();
        List<Button> botoes = new ArrayList<>();
        botoes.add((Button) findViewById(R.id.button1));
        posicoes.put(botoes.get(0),new Posicao(0,0));
        botoes.add((Button) findViewById(R.id.button2));
        posicoes.put(botoes.get(1),new Posicao(0,1));
        botoes.add((Button) findViewById(R.id.button3));
        posicoes.put(botoes.get(2),new Posicao(0,2));
        botoes.add((Button) findViewById(R.id.button4));
        posicoes.put(botoes.get(3),new Posicao(1,0));
        botoes.add((Button) findViewById(R.id.button5));
        posicoes.put(botoes.get(4),new Posicao(1,1));
        botoes.add((Button) findViewById(R.id.button6));
        posicoes.put(botoes.get(5),new Posicao(1,2));
        botoes.add((Button) findViewById(R.id.button7));
        posicoes.put(botoes.get(6),new Posicao(2,0));
        botoes.add((Button) findViewById(R.id.button8));
        posicoes.put(botoes.get(7),new Posicao(2,1));
        botoes.add((Button) findViewById(R.id.button9));
        posicoes.put(botoes.get(8),new Posicao(2,2));

        View.OnClickListener ouvinte = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;

            }
        };

        for (Button botao : botoes) {
            botao.setOnClickListener(ouvinte);
        }
    }

    class Posicao{
        public int l;
        public int c;

        Posicao(int l, int c){
            this.c = c;
            this.l = l;
        }
    }
}
