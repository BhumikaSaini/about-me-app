package com.example.android.aboutme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openEducation(View view) {
        Intent i = new Intent(this, education.class);
        startActivity(i);
    }

    public void openSkills(View view) {
        Intent i = new Intent(this, skills.class);
        startActivity(i);
    }

    public void openWebPresence(View view) {
        Intent i = new Intent(this, web_presence.class);
        startActivity(i);
    }


    public void openHobbies(View view) {
        Intent i = new Intent(this, hobbies.class);
        startActivity(i);
    }

    public void openAchievements(View view) {
        Intent i = new Intent(this, achievements.class);
        startActivity(i);
    }

    public void contactMe(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@host.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        intent.putExtra(Intent.EXTRA_TEXT, "E-mail body");

        startActivity(Intent.createChooser(intent, "Send Email"));
    }
}
