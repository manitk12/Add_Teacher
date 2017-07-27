package com.grademojo.add_teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class Teacher_Select_Yes_Again extends AppCompatActivity {


    private String[] Spinner_Block_arr5, Spinner_Block_arr6;

    private Spinner  blockSpinner5 ,blockSpinner6;


    private CardView toogle_cover ,main_card_View;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher__select__yes__again);


        blockSpinner5 = (Spinner) findViewById(R.id.edit_text_nine);

        blockSpinner6 = (Spinner) findViewById(R.id.edit_text_nine_section);


        toogle_cover = (CardView) findViewById(R.id.toggle_button);

        main_card_View = (CardView) findViewById(R.id.edit_card_view_genger);




        Spinner_Block_arr5 = new String[]  { "IX" ,"X" ,"XI"} ;


        Spinner_Block_arr6 = new String[]  {"A" ,"B" ,"C"} ;





        ArrayAdapter<String> adapterBlockArr4 = new ArrayAdapter<String>(this, R.layout.spinner, Spinner_Block_arr5);
        blockSpinner5.setAdapter(adapterBlockArr4);



        ArrayAdapter<String> adapterBlockArr5 = new ArrayAdapter<String>(this, R.layout.spinner, Spinner_Block_arr6);
        blockSpinner6.setAdapter(adapterBlockArr5);




        main_card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                    RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toogle_cover.getLayoutParams();

                    lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_yes);
                    lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_yes);


                    Intent i = new Intent(Teacher_Select_Yes_Again.this,Teacher_Select_no.class);
                    startActivity(i);








                    toogle_cover.setLayoutParams(lps);















            }
        });




    }
}
