package com.grademojo.add_teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.RelativeLayout;

public class Teacher_Select_no extends AppCompatActivity {


    private CardView toogle_cover ,main_card_View;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__select_no);


        toogle_cover = (CardView) findViewById(R.id.toggle_button);

        main_card_View = (CardView) findViewById(R.id.edit_card_view_genger);





        main_card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                    RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toogle_cover.getLayoutParams();

                    lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_no);
                    lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_no);

                    toogle_cover.setLayoutParams(lps);


                    Intent i = new Intent(Teacher_Select_no.this,Teacher_select_yes.class);
                    startActivity(i);




            }
        });




    }
}
