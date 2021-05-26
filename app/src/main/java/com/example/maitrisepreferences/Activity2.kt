package com.example.maitrisepreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val constLayout=findViewById<ConstraintLayout>(R.id.layout_act2)
        val sharedpreferences = getSharedPreferences("backgrounds_color", Context.MODE_PRIVATE)
        val color_key =sharedpreferences.getInt("color_key", 0)
        if (color_key==1){
            constLayout.setBackgroundColor(getResources().getColor(R.color.green_c))
        }else if (color_key==2){
            constLayout.setBackgroundColor(getResources().getColor(R.color.red_c))
        }else if(color_key==3){
            constLayout.setBackgroundColor(getResources().getColor(R.color.blue_c))
        }
        else if(color_key==4){
            constLayout.setBackgroundColor(getResources().getColor(R.color.yellow_c))
        }
        else if(color_key==5){
            constLayout.setBackgroundColor(getResources().getColor(R.color.black_c))
        }
        else if(color_key==6){
            constLayout.setBackgroundColor(getResources().getColor(R.color.pink_c))
        }
        else if(color_key==7){
            constLayout.setBackgroundColor(getResources().getColor(R.color.purple_c))
        }
        else if(color_key==8){
            constLayout.setBackgroundColor(getResources().getColor(R.color.white_c))
        }
        else if(color_key==9){
            constLayout.setBackgroundColor(getResources().getColor(R.color.blued_c))
        }
    }
}