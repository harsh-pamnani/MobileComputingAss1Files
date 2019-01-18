package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private boolean clicked;
    private Button colorChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorChanger = findViewById(R.id.btnChangeText);
        clicked=false;
        // Comment

        colorChanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!clicked) {
                    colorChanger.setText(getResources().getText(R.string.btn_clicked));
                    colorChanger.setBackgroundColor(getResources().getColor(R.color.colorRed,getResources().newTheme()));
                    clicked=true;
                } else {
                    colorChanger.setText(getResources().getText(R.string.btn_not_clicked));
                    colorChanger.setBackgroundColor(getResources().getColor(R.color.colorGray,getResources().newTheme()));
                    clicked=false;
                }
            }
        });
    }
}
