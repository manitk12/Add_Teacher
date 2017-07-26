package com.grademojo.add_teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {


    private String[] Spinner_Block_arr;

    private Spinner blockSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        blockSpinner = (Spinner) findViewById(R.id.edit_text_gender);

        Spinner_Block_arr = new String[]  {"Male", "Female"} ;




        ArrayAdapter<String> adapterBlockArr = new ArrayAdapter<String>(this, R.layout.spinner, Spinner_Block_arr);
        blockSpinner.setAdapter(adapterBlockArr);
    }
}
