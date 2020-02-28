package com.example.kotlinconditions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = 10;
        val num2 = 20;
        val res = if (num1 > num2) {
            "$num1 is greater than $num2"//we are using $ symbol inside the string to make difference between String and val variables
        } else {
            "$num1 is smaller than $num2"
        }
        println("final result will be given as=" + res)
        println()
        val num = 10;
        val reslt = if (num > 0) {
            "$num is positive"
        } else if (num < 0) {
            "$num is negative"
        } else {
            "$num is zero"
        }
        println(reslt)
    }
}
