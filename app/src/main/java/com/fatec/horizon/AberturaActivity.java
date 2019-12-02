package com.fatec.horizon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class AberturaActivity extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abertura);

        progressBar = findViewById(R.id.progressBar1);
        progressBar.setVisibility(View.VISIBLE);

        Timer timer = new Timer();
        timer.schedule(new IniciarPrincipal(), 2000);


    }

    private class IniciarPrincipal extends TimerTask {

        @Override
        public void run() {

            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}

