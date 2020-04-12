package com.example.tipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercent = tipEditText.text.toString().toDouble()
            val tip = tipPercent * bill / 100
            val total = bill + tip



            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(total)}"
            infoTextView.visibility = View.VISIBLE
        }
    }

    fun doubleToDollar(number:Double): String {
        return "$" + String.format("%.2f", number)
    }
}
