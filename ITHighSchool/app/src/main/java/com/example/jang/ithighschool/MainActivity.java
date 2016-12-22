package com.example.jang.ithighschool;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;

@SuppressWarnings("deprecation")

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton7);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ownActivity.class);
                startActivity(intent);
            }
        });


        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("tab1").setIndicator("시간표");
        tabSpec1.setContent(R.id.tab1);
        tabHost.addTab(tabSpec1);

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2").setIndicator("급식표");
        tabSpec2.setContent(R.id.tab2);
        tabHost.addTab(tabSpec2);

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tab3").setIndicator("시험일정");
        tabSpec3.setContent(R.id.tab3);
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);

    }
}
