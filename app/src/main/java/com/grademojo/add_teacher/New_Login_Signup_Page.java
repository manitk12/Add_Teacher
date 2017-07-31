package com.grademojo.add_teacher;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class New_Login_Signup_Page extends AppCompatActivity {


//    float paddingPx = 10f;
//    int paddingDp = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, paddingPx,getScreenDensityScale()



    private  float SCREEN_DENSITY;

    private ImageView login_image ,Signup_image;

    private CardView login_Card_View , sign_up_Card_View;


    private TextView text_Login ,text_Signup;


    // holder.text_Present.setTextColor(ContextCompat.getColor(context,R.color.green));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__login__signup__page);

        login_image = (ImageView) findViewById(R.id.image_login);
        Signup_image = (ImageView) findViewById(R.id.image_sign_up);

        login_Card_View = (CardView) findViewById(R.id.login_card_view);
        sign_up_Card_View = (CardView) findViewById(R.id.sign_card_view);

        text_Login = (TextView) findViewById(R.id.login_text);
        text_Signup = (TextView) findViewById(R.id.sign_up_text);



        SCREEN_DENSITY = getScreenDensityScale(this);


        login_Card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams login = login_image.getLayoutParams();
                ViewGroup.LayoutParams signup = Signup_image.getLayoutParams();




                text_Login.setPadding(convertDpToPx(20,SCREEN_DENSITY),convertDpToPx(10, SCREEN_DENSITY),convertDpToPx(20, SCREEN_DENSITY),convertDpToPx(10,SCREEN_DENSITY));
                text_Signup.setPadding(convertDpToPx(15,SCREEN_DENSITY),convertDpToPx(10, SCREEN_DENSITY),convertDpToPx(15, SCREEN_DENSITY),convertDpToPx(10,SCREEN_DENSITY));




                text_Login.setTextColor(Color.parseColor("#ffffff"));

                text_Signup.setTextColor(Color.parseColor("#8e8e8e"));






                login.height = convertDpToPx(60,SCREEN_DENSITY);
                login.width = convertDpToPx(60, SCREEN_DENSITY);
                login_image.setLayoutParams(login);

                signup.height = convertDpToPx(0, SCREEN_DENSITY);
                signup.width = convertDpToPx(0 , SCREEN_DENSITY);

                Signup_image.setLayoutParams(signup);

                login_Card_View.setCardBackgroundColor(Color.parseColor("#5662cc"));
                login_Card_View.setCardElevation(5);

                login_Card_View.setRadius(convertDpToPx(22, SCREEN_DENSITY));


                sign_up_Card_View.setCardBackgroundColor(Color.parseColor("#f9f9f9"));

                sign_up_Card_View.setCardElevation(5);

                sign_up_Card_View.setRadius(convertDpToPx(25, SCREEN_DENSITY));







//                app:cardCornerRadius="25dp"
//                app:cardElevation="5dp"
//                android:layout_marginTop="2dp"
//                app:cardBackgroundColor="@color/white"


            }
        });



        sign_up_Card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewGroup.LayoutParams login = login_image.getLayoutParams();
                ViewGroup.LayoutParams signup = Signup_image.getLayoutParams();

                text_Signup.setPadding(convertDpToPx(20,SCREEN_DENSITY),convertDpToPx(10, SCREEN_DENSITY),convertDpToPx(20, SCREEN_DENSITY),convertDpToPx(10,SCREEN_DENSITY));
                text_Login.setPadding(convertDpToPx(15,SCREEN_DENSITY),convertDpToPx(10, SCREEN_DENSITY),convertDpToPx(15, SCREEN_DENSITY),convertDpToPx(10,SCREEN_DENSITY));



                text_Signup.setTextColor(Color.parseColor("#ffffff"));

                text_Login.setTextColor(Color.parseColor("#8e8e8e"));





//
//                android:paddingTop="15dp"
//
//                android:paddingStart="2dp"
//                android:paddingEnd="2dp"
//                android:paddingBottom="15dp"


//                text_Signup.setPadding(2,15,2,15);
//                text_Login.setPadding(20,10,20,10);



                login.height = convertDpToPx(0,SCREEN_DENSITY);
                login.width = convertDpToPx(0, SCREEN_DENSITY);
                login_image.setLayoutParams(login);

                signup.height = convertDpToPx(60, SCREEN_DENSITY);
                signup.width = convertDpToPx(60 , SCREEN_DENSITY);

                Signup_image.setLayoutParams(signup);



                sign_up_Card_View.setCardBackgroundColor(Color.parseColor("#5662cc"));
                sign_up_Card_View.setCardElevation(5);

                sign_up_Card_View.setRadius(convertDpToPx(22, SCREEN_DENSITY));


                login_Card_View.setCardBackgroundColor(Color.parseColor("#f9f9f9"));

                login_Card_View.setCardElevation(5);

                login_Card_View.setRadius(convertDpToPx(25, SCREEN_DENSITY));

            }
        });





    }



    private float getScreenDensityScale(Context context){
        return context.getResources().getDisplayMetrics().density;
    }


    // Using Math.ceil so that any "decimal pixel height" (which is not making sense even when I am writing it
    // is not lost due to truncation to int
    private int convertDpToPx(float dp, final float densityScale){
        return (int) Math.ceil(dp * densityScale + 0.5f);
    }


}
