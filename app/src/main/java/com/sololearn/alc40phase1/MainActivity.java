package com.sololearn.alc40phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_my_profile;
    private Button btn_about_alc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_about_alc = findViewById(R.id.btn_about_alc);
        btn_about_alc.setOnClickListener(this);
        btn_my_profile = findViewById(R.id.btn_my_profile);
        btn_my_profile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_about_alc:
                Intent alcIntent = new Intent(this, AboutAlc.class);
                startActivity(alcIntent);
                break;

            case R.id.btn_my_profile:
                Intent profileIntent = new Intent(this, MyProfile.class);
                startActivity(profileIntent);
                break;

            default:
                break;
        }

    }
}
