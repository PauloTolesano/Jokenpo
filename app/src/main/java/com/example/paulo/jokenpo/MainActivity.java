package com.example.paulo.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int placarGamer = 0;
    int placarPc = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);
    }
    public void pedra (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            Toast.makeText(MainActivity.this, "Deu empate", Toast.LENGTH_LONG).show();
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }
    }
    public void papel (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            Toast.makeText(MainActivity.this, "Deu empate", Toast.LENGTH_LONG).show();
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }
    }
    public void tesoura (View view){
        int escolhaPc = (int) (Math.random()*3)+1;

        if(escolhaPc == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            placarPc++;
            TextView pontos = (TextView) findViewById(R.id.placarPc);
            pontos.setText(String.valueOf(this.placarPc));
        }else if(escolhaPc == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            placarGamer++;
            TextView pontos = (TextView) findViewById(R.id.placarGamer);
            pontos.setText(String.valueOf(this.placarGamer));
        }else if(escolhaPc == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            Toast.makeText(MainActivity.this, "Deu empate", Toast.LENGTH_LONG).show();
        }
    }

}


