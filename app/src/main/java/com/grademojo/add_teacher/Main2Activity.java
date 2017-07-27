package com.grademojo.add_teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private CardView toggle;


    private Button yes_button ,no_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        yes_button = (Button) findViewById(R.id.yes);
        no_button = (Button) findViewById(R.id.no);



        toggle = (CardView) findViewById(R.id.toggle_button1);


        yes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toggle.getLayoutParams();

                lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_no);
                lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_no);
                lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_no);
                lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_no);


                toggle.setLayoutParams(lps);


                }

        });



        no_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toggle.getLayoutParams();

                lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_yes);


                toggle.setLayoutParams(lps);

            }



        });


    }
}
