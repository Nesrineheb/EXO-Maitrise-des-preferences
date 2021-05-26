package com.example.maitrisepreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_settings)
            val constLayout=findViewById<ConstraintLayout>(R.id.layout_setting)
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

            val editor: SharedPreferences.Editor = sharedpreferences.edit()


            val button_green = findViewById<Button>(R.id.button8)
            button_green.setOnClickListener {
                constLayout.setBackgroundColor(getResources().getColor(R.color.green_c))
                editor.putInt("color_key", 1 )

                editor.commit()
            }
            val button_red = findViewById<Button>(R.id.button5)
            button_red.setOnClickListener {
                constLayout.setBackgroundColor(getResources().getColor(R.color.red_c))
                editor.putInt("color_key", 2 )
                editor.commit()
            }
            val button_blue = findViewById<Button>(R.id.button3)
            button_blue.setOnClickListener {
                constLayout.setBackgroundColor(getResources().getColor(R.color.blue_c))
                editor.putInt("color_key", 3 )
                editor.commit()
            }
        val button_yellow = findViewById<Button>(R.id.button6)
        button_yellow.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.yellow_c))
            editor.putInt("color_key", 4 )
            editor.commit()
        }
        val button_black = findViewById<Button>(R.id.button4)
        button_black.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.black_c))
            editor.putInt("color_key", 5 )
            editor.commit()
        }
        val button_pink = findViewById<Button>(R.id.button)
        button_pink.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.pink_c))
            editor.putInt("color_key", 6 )
            editor.commit()
        }
        val button_purple = findViewById<Button>(R.id.button2)
        button_purple .setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.purple_c))
            editor.putInt("color_key", 7 )
            editor.commit()
        }
        val button_white = findViewById<Button>(R.id.button7)
        button_white.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.white_c))
            editor.putInt("color_key", 8 )
            editor.commit()
        }
        val button_blued = findViewById<Button>(R.id.button9)
        button_blued.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.blued_c))
            editor.putInt("color_key", 9 )
            editor.commit()
        }



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.activity_one -> {
                Toast.makeText(this, "activity one", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity2::class.java)
                startActivity(intent)

                return true
            }
            R.id.activity_two -> {
                Toast.makeText(this, "activity two", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)

                return true
            }

            else -> return super.onOptionsItemSelected(item)
        }
    }



}