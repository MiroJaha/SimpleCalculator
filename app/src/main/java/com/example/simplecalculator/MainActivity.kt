package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var entry1: EditText
    private lateinit var entry2: EditText
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entry1= findViewById(R.id.entry1)
        entry2= findViewById(R.id.entry2)
        result= findViewById(R.id.result)

    }

    fun plus(view: View) {
        if (entry1.text.isNotBlank()&&entry2.text.isNotBlank())
            "${entry1.text.toString().toFloat()+entry2.text.toString().toFloat()}".also { result.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
    fun minus(view: View) {
        if (entry1.text.isNotBlank()&&entry2.text.isNotBlank())
            "${entry1.text.toString().toFloat()-entry2.text.toString().toFloat()}".also { result.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
    fun multiply(view: View) {
        if (entry1.text.isNotBlank()&&entry2.text.isNotBlank())
            "${entry1.text.toString().toFloat()*entry2.text.toString().toFloat()}".also { result.text = it }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
    fun divide(view: View) {
        if (entry1.text.isNotBlank()&&entry2.text.isNotBlank()) {
            if (entry2.text.toString().toFloat() != 0f)
                "${
                    entry1.text.toString().toFloat() / entry2.text.toString().toFloat()
                }".also { result.text = it }
            else
                Toast.makeText(this,"Can't divide by 0",Toast.LENGTH_SHORT).show()
        }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
}