package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class HomeworkOne : AppCompatActivity() {
    lateinit var textMan : TextView
    lateinit var one : Button
    lateinit var two : Button
    lateinit var three : Button
    lateinit var operation : Button
    lateinit var resultMan : Button

    var targetList : ArrayList<Button> = ArrayList()
    var addState: Boolean = true
    var tmp: LinkedList<Int> =  LinkedList()

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_one)
        findViews()


//        one.setOnClickListener {
//            if(addState){
//                val receiver = (it as Button).text
//                val preInput = textMan.text as String
//                Log.d("testtt",receiver.toString() )
//                val toString = if(textMan.text == "0")  receiver.toString() else preInput+receiver.toString()
//                textMan.setText(toString)
//            }else{
//                val receiver = (it as Button).text
//                textMan.setText(receiver.toString())
//                addState = true
//            }
//        }

        setListener(targetList, {bu:Button ->
            if(addState){
                val receiver = (bu as Button).text
                val preInput = textMan.text as String
                Log.d("testtt",receiver.toString() )
                val toString = if(textMan.text == "0")  receiver.toString() else preInput+receiver.toString()
                textMan.setText(toString)
            }else{
                val receiver = (bu as Button).text
                textMan.setText(receiver.toString())
                addState = true
            }
        })

        operation.setOnClickListener{
            val text :String = textMan.text.toString()
            Log.d("testtt", text.toString())
            tmp.add(text.toInt())
            addState = false
        }



        resultMan.setOnClickListener{
            Log.d("testtt", tmp.size.toString())
            if(tmp.size == 0 ){
                textMan.setText("0")
            }else{

//                tmp.stream().forEach { it ->
//                    println("what")
//                    println(it.toString())
//                }

                var returnResult : Int = tmp.reduce { sum, value ->
                    sum + value
                }
                val finalInput : String = textMan.text as String
                Log.d("testtt", finalInput)
                val toInt = finalInput.toInt() + returnResult
                addState = true
                tmp = LinkedList()
                textMan.setText(toInt.toString())
            }
        }


    }

    fun setListener(target: ArrayList<Button>, funcButton : (bu : Button )-> Unit ){
        target.stream().forEach {
            it -> it.setOnClickListener{
                funcButton(it as Button)
            }
        }

    }




    fun findViews(){
        textMan = findViewById(R.id.textOneT)
        one = findViewById(R.id.buttonOneT)
        two = findViewById(R.id.buttonTwoT)
        three = findViewById(R.id.buttonThreeT)
        operation = findViewById(R.id.buttonPlusT)
        resultMan = findViewById(R.id.buttonResultT)
        targetList.add(one)
        targetList.add(two)
        targetList.add(three)

    }

}