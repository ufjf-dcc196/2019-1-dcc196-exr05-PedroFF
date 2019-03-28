package com.example.exercicio05;

public class JogoDaVelha {
    private String vez;
    private String [][] mapa = new String[][]{
            {"","",""},
            {"","",""},
            {"","",""}
    };

    private boolean terminado = false;

    public void jogaga(int l, int c){
        this.mapa[l][c] = this.vez;
    }
}
