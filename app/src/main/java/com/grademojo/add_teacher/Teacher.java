package com.grademojo.add_teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RelativeLayout;

public class Teacher extends AppCompatActivity {


    private CardView toogle_cover ,main_card_View;







    private Boolean button_state_yes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);


        toogle_cover = (CardView) findViewById(R.id.toggle_button);

        main_card_View = (CardView) findViewById(R.id.edit_card_view_genger);


        button_state_yes = true;

        main_card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (button_state_yes)
                {
                    button_state_yes = false;


                    RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toogle_cover.getLayoutParams();

                    lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_yes);

                    toogle_cover.setLayoutParams(lps);
                }

                else {

                    button_state_yes = true;


                    RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toogle_cover.getLayoutParams();

                    lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_no);

                    toogle_cover.setLayoutParams(lps);



                }


            }
        });









    }
}
