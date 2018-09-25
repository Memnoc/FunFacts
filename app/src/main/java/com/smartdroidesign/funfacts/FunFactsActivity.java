package com.smartdroidesign.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook factBook = new FactBook();

    private TextView factTextView;
    private Button showFactBtn;
    private RelativeLayout relativeLayout;
    private ColorWheel colorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = findViewById(R.id.factTextView);
        showFactBtn = findViewById(R.id.factBtn);
        relativeLayout = findViewById(R.id.layoutMain);

        showFactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = factBook.getFact();

                factTextView.setText(fact);

                int color = colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactBtn.setTextColor(color);
            }
        });
        Toast.makeText(this, "Activity was created", Toast.LENGTH_SHORT).show();
    }
}
