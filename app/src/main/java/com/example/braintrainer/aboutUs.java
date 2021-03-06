package com.example.braintrainer;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
//import android.provider.CalendarContract;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class aboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);



        Element adsElement = new Element();
        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.k1p11)
                .setDescription(" Hello everyone :) \n A small effort from our side so that people could have fun as well as train their brain\n\n Developers:\n Jois Prabhanjan\n Kartik Belligatti")
                .addItem(new Element().setTitle("Version 1.0"))
                .addGroup("CONNECT WITH US!")
                .addEmail("jois.prabhanjan@gmail.com","Contact Prabhanjan ")
                .addEmail("belligattikartik17@gmail.com","Contact Kartik")
                .addGitHub("PrabhanjanJois","Fork Prabhanjan on GitHub")
                .addGitHub("KartikBelligatti","Fork Kartik on GitHub")
                .addInstagram("prabhanjan_jois","Click to follow Prabhanjan")
                .addInstagram("imkartik_17","Click to follow Kartik")//Your instagram id
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
    private Element createCopyright()
    {
        Element copyright = new Element();
        @SuppressLint("DefaultLocale") final String copyrightString = String.format("Copyright %d by KP creations", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        // copyright.setIcon(R.mipmap.ic_launcher);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(aboutUs.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }
}