package com.example.clock;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout Sydney =
                findViewById(R.id.Sydney);
        TextView SydneyTitle =
                Sydney.findViewById(R.id.cityName);
        SydneyTitle.setText(R.string.Sydney);

        final TextClock SydneyTime =
                Sydney.findViewById(R.id.cityTime);
        SydneyTime.setTimeZone("GMT+10");

        ImageView SydneyIcon =
                Sydney.findViewById(R.id.cityIcon);
        SydneyIcon.setImageResource(R.drawable.sydney_icon);

        final LinearLayout Utrecht =
                findViewById(R.id.Utrecht);
        TextView UtrechtTitle =
                Utrecht.findViewById(R.id.cityName);
        UtrechtTitle.setText(R.string.Utrecht);

        final TextClock UtrechtTime =
                Utrecht.findViewById(R.id.cityTime);
        UtrechtTime.setTimeZone("GMT+2");

        ImageView UtrechtIcon =
                Utrecht.findViewById(R.id.cityIcon);
        UtrechtIcon.setImageResource(R.drawable.utrecht_icon);

        LinearLayout Tokyo =
                findViewById(R.id.Tokyo);
        TextView TokyoTitle =
                Tokyo.findViewById(R.id.cityName);
        TokyoTitle.setText(R.string.Tokyo);

        final TextClock TokyoTime =
                Tokyo.findViewById(R.id.cityTime);
        TokyoTime.setTimeZone("GMT+9");


        ImageView TokyoIcon =
                Tokyo.findViewById(R.id.cityIcon);
        TokyoIcon.setImageResource(R.drawable.tokyo_icon);

        LinearLayout New_York =
                findViewById(R.id.New_York);
        TextView New_YorkTitle =
                New_York.findViewById(R.id.cityName);
        New_YorkTitle.setText(R.string.New_York);

        final TextClock New_YorkTime =
                New_York.findViewById(R.id.cityTime);
        New_YorkTime.setTimeZone("GMT-4");


        ImageView New_YorkIcon =
                New_York.findViewById(R.id.cityIcon);
        New_YorkIcon.setImageResource(R.drawable.new_york_icon);

        LinearLayout London =
                findViewById(R.id.London);
        TextView LondonTitle =
                London.findViewById(R.id.cityName);
        LondonTitle.setText(R.string.London);

        final TextClock LondonTime =
                London.findViewById(R.id.cityTime);
        LondonTime.setTimeZone("GMT+1");

        ImageView LondonIcon =
                London.findViewById(R.id.cityIcon);
        LondonIcon.setImageResource(R.drawable.london_icon);

        final Button format_12 = findViewById(R.id.format_12);
        format_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SydneyTime.setFormat12Hour("hh:mm:ss a");
                UtrechtTime.setFormat12Hour("hh:mm:ss a");
                TokyoTime.setFormat12Hour("hh:mm:ss a");
                New_YorkTime.setFormat12Hour("hh:mm:ss a");
                LondonTime.setFormat12Hour("hh:mm:ss a");
            }
        });

        final Button format_24 = findViewById(R.id.format_24);
        format_24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SydneyTime.setFormat12Hour("kk:mm:ss a");
                UtrechtTime.setFormat12Hour("kk:mm:ss a");
                TokyoTime.setFormat12Hour("kk:mm:ss a");
                New_YorkTime.setFormat12Hour("kk:mm:ss a");
                LondonTime.setFormat12Hour("kk:mm:ss a");
            }
        });
    }
}



