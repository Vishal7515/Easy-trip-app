package com.pesuio.easytrip.easytrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Selection_panel extends AppCompatActivity {


    public void visit(View view){
        ProgressBar a=(ProgressBar) findViewById(R.id.prgs);
        a.setVisibility(View.VISIBLE);
        Intent intent = new Intent(Selection_panel.this, places.class);
        startActivity(intent);
    }
    public void visit1(View view){
        Intent intent = new Intent(Selection_panel.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_panel);
        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show start activity

            startActivity(new Intent(Selection_panel.this, Welcome.class));
            Toast.makeText(Selection_panel.this, "First Run", Toast.LENGTH_LONG)
                    .show();
        }

    }
}
