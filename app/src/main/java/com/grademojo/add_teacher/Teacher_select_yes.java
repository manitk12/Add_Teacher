package com.grademojo.add_teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Spinner;

public class Teacher_select_yes extends AppCompatActivity {


    private String[] Spinner_Block_arr, Spinner_Block_arr2;

    private Spinner  blockSpinner ,blockSpinner2;


    private ImageView Plus_image;


    private CardView toogle_cover , main_card_View;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_select_yes);


        blockSpinner = (Spinner) findViewById(R.id.edit_text_gender);

        blockSpinner2 = (Spinner) findViewById(R.id.edit_text_gender1);


        toogle_cover = (CardView) findViewById(R.id.toggle_button);

        main_card_View = (CardView) findViewById(R.id.edit_card_view_genger);

        Plus_image = (ImageView) findViewById(R.id.plus_button);

        Spinner_Block_arr = new String[]  { "VI", "VII"} ;


        Spinner_Block_arr2 = new String[]  {"A" ,"B" } ;



        Plus_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Teacher_select_yes.this,Teacher_Select_Yes_Again.class);
                startActivity(i);
            }
        });










        ArrayAdapter<String> adapterBlockArr = new ArrayAdapter<String>(this, R.layout.spinner, Spinner_Block_arr);
        blockSpinner.setAdapter(adapterBlockArr);



        ArrayAdapter<String> adapterBlockArr2 = new ArrayAdapter<String>(this, R.layout.spinner, Spinner_Block_arr2);
        blockSpinner2.setAdapter(adapterBlockArr2);





        main_card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                RelativeLayout.LayoutParams lps = (RelativeLayout.LayoutParams) toogle_cover.getLayoutParams();

                lps.addRule(RelativeLayout.ALIGN_START, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_END, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_TOP, R.id.frame_yes);
                lps.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.frame_yes);


                Intent i = new Intent(Teacher_select_yes.this,Teacher_Select_no.class);
                startActivity(i);








                toogle_cover.setLayoutParams(lps);















            }
        });
    }
}
