package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class ViewControlOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control_one)


        //뷰를 코틀린 파일로 가져오는 방법
        val textViewOne: TextView = findViewById(R.id.textViewOneT)
        val buttonOne: Button = findViewById(R.id.buttonOne)
        val get : String = textViewOne.text.toString();
        Log.d("testt",get)


        //Listener 사용 방법
//        buttonOne.setOnClickListener{
//            //버튼이 클릭  되었을때 동작하는 코드 작성
//            Log.d("testt", "button click!")
//        }

        val clickListener = object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("testt", "button click!")
            }
        }

        buttonOne.setOnClickListener(clickListener)


    }
}