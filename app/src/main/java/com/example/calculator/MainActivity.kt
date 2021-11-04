package com.example.calculator

import android.annotation.SuppressLint
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

    private  var temp  = 0.0
    private  var numberOne = 0.0
    private  var numberTwo = 0.0


    @SuppressLint("SetTextI18n")
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

            result.text = "the sum is ${cheackNumbers('+')}"
        }

        minusBtn.setOnClickListener{

            result.text = "the subtract is ${cheackNumbers('-')}"
        }

        multiplyBtn.setOnClickListener{

            result.text = "the multiply is ${cheackNumbers('*')}"
        }

        divideBtn.setOnClickListener{

            result.text = "the divide is ${"%.4f".format(cheackNumbers('/'))}"
        }

    }

    fun cheackNumbers (operation:Char):Double{
        try {
            numberOne = Integer.parseInt(number1.text.toString()).toDouble()
            numberTwo = Integer.parseInt(number2.text.toString()).toDouble()

            if (numberTwo == 0.0){
                Toast.makeText(this,R.string.divide_by_zero,Toast.LENGTH_LONG).show()
            }
        }catch (e: NumberFormatException){
            Toast.makeText(this,R.string.toast,Toast.LENGTH_LONG).show()
        }

        temp = when (operation){
            '+' -> numberOne + numberTwo
            '-' -> numberOne - numberTwo
            '*'-> numberOne * numberTwo
            '/' -> {
                if (numberTwo == 0.0){
                    Toast.makeText(this,R.string.divide_by_zero,Toast.LENGTH_LONG).show()
                    0.0
                } else{
                    numberOne / numberTwo
                }
            }
            else -> 0.0
        }
            return temp
            }


}