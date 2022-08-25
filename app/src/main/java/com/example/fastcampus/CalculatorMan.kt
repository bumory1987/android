package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*

class CalculatorMan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_man)


        var tmp: LinkedList<Int> =  LinkedList()

        val textMan: TextView = findViewById(R.id.textOne)

        val buttonOne: Button = findViewById(R.id.buttonOne)

        val buttonTwo: Button = findViewById(R.id.buttonTwo)

        val buttonThree: Button = findViewById(R.id.buttonThree)


        val operator: Button = findViewById(R.id.buttonPlus)

        val buttonResult: Button =findViewById(R.id.buttonResult)

        var addState: Boolean = true

        buttonOne.setOnClickListener {
            if(addState){
                val text = textMan.text
                val toString = if(text == "0")  "1" else text.toString()+"1"
                textMan.setText(toString)
            }else{
                textMan.setText("1")
                addState = true
            }

        }



        buttonTwo.setOnClickListener {
            if(addState){
                val text = textMan.text
                val toString = if(text == "0")  "2" else text.toString()+"2"
                textMan.setText(toString)
            }else{
                textMan.setText("2")
                addState = true
            }

        }


        buttonThree.setOnClickListener {
            if(addState){
                val text = textMan.text
                val toString = if(text == "0")  "3" else text.toString()+"3"
                textMan.setText(toString)
            }else{
                textMan.setText("3")
                addState = true
            }

        }




        operator.setOnClickListener{
            val text :String = textMan.text.toString()
            Log.d("testtt", text.toString())
            tmp.add(text.toInt())
//            tmp.stream().forEach{it->
//
//                Log.d("testtt", it.toString() +"_insert")
//            }
            addState = false


        }

        buttonResult.setOnClickListener{
            Log.d("testtt", tmp.size.toString())
            if(tmp.size == 0 ){
                textMan.setText("0")
            }else{

                tmp.stream().forEach { it ->
                    println("what")
                    println(it.toString())
                }
                var returnResult : Int = tmp.reduce { sum, value ->
                    sum + value
                }
                addState = true
                tmp = LinkedList()
                textMan.setText(returnResult.toString())
            }
        }



    }
}