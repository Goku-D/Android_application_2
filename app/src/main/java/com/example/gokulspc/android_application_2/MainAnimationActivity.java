package com.example.gokulspc.android_application_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainAnimationActivity extends AppCompatActivity {

    ViewGroup myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_animation);

        myLayout = (ViewGroup) findViewById(R.id.myLayout);

        myLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener(){
                    public boolean onTouch(View v, MotionEvent event){
                        moveButton();
                        return true;
                    }
                }
        );
    }

    public void moveButton(){
        View myButton = findViewById(R.id.myButton);
        RelativeLayout.LayoutParams PositionRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        PositionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        myButton.setLayoutParams(PositionRules);

                        ViewGroup.LayoutParams sizeRules = myButton.getLayoutParams();
                        sizeRules.width=450;
                        sizeRules.height=500;
                        myLayout.setLayoutParams(sizeRules);

    }


}