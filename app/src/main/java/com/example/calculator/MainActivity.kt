package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    // buttons
    private lateinit var plusBtn : Button
    private lateinit var minusBtn: Button
    private lateinit var divideBtn: Button
    private lateinit var multiplyBtn: Button

    // textview
    private lateinit var  result : TextView

    // Edit text
    private lateinit var number1 : EditText
    private lateinit var number2 : EditText

    private lateinit var temp : Number
    private  var numberOne = 0
    private  var numberTwo = 0

    private var temp1 = ""
    private var temp2 = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusBtn = findViewById(R.id.plus)
        minusBtn = findViewById(R.id.minus)
        divideBtn = findViewById(R.id.divide)
        multiplyBtn = findViewById(R.id.multiply)

        result = findViewById(R.id.result)

        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)



        plusBtn.setOnClickListener{
            try {
                numberOne = Integer.parseInt(number1.text.toString())
                numberTwo = Integer.parseInt(number2.text.toString())
            }catch (e: NumberFormatException){
                Toast.makeText(this,R.string.toast,Toast.LENGTH_LONG).show()
            }

            temp = numberOne + numberTwo
            result.text = "the sum is ${temp}"
        }

        minusBtn.setOnClickListener{
            try {
                numberOne = Integer.parseInt(number1.text.toString())
                numberTwo = Integer.parseInt(number2.text.toString())
            }catch (e: NumberFormatException){
                Toast.makeText(this,R.string.toast,Toast.LENGTH_LONG).show()
            }

            temp = numberOne - numberTwo
            result.text = "the sum is ${temp}"
        }

        multiplyBtn.setOnClickListener{
            try {
                numberOne = Integer.parseInt(number1.text.toString())
                numberTwo = Integer.parseInt(number2.text.toString())
            }catch (e: NumberFormatException){
                Toast.makeText(this,R.string.toast,Toast.LENGTH_LONG).show()
            }

            temp = numberOne * numberTwo
            result.text = "the sum is ${temp}"
        }

        divideBtn.setOnClickListener{
            try {
                numberOne = Integer.parseInt(number1.text.toString())
                numberTwo = Integer.parseInt(number2.text.toString())

                if (numberTwo == 0){
                    Toast.makeText(this,R.string.divide_by_zero,Toast.LENGTH_LONG).show()
                }
            }catch (e: NumberFormatException){
                Toast.makeText(this,R.string.toast,Toast.LENGTH_LONG).show()
            }

            temp = numberOne / numberTwo
            result.text = "the sum is ${temp}"
        }

    }


}