package com.example.registracia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var xx: EditText
        var ccv: EditText
        var mm: EditText
        var yy: EditText
        var check: CheckBox
        var but: Button

        xx = findViewById(R.id.XX)
        ccv = findViewById(R.id.CC)
        mm = findViewById(R.id.MM)
        yy = findViewById(R.id.YY)
        check = findViewById(R.id.check)
        but = findViewById(R.id.press)

        but.setOnClickListener {
            if (xx.text.toString().length != 16 || !xx.text.toString().all { it.isDigit() }) {

                Toast.makeText(applicationContext,"თქვენ არასწორად შეიყვანეთ ბარათის ნომერი",Toast.LENGTH_LONG).show()

            } else if (ccv.text.toString().length != 4 || !xx.text.toString()
                    .all { it.isDigit() }
            ) {

                Toast.makeText(applicationContext, "CVV არასწორადაა მითითებული", Toast.LENGTH_LONG)
                    .show()

            } else if (mm.text.toString().length != 2 || !xx.text.toString().all { it.isDigit() } || yy.text.toString().length !=
                4 || !yy.toString().all { it.isDigit() })
            {

                Toast.makeText(applicationContext, "თარიღი არასწორედაა შეყვანილი", Toast.LENGTH_LONG).show()

            } else if (!check.isChecked) {

                Toast.makeText(applicationContext, "check the checkbox", Toast.LENGTH_LONG).show()

            } else {

                Toast.makeText(applicationContext, "თქვენ წარმატებით გაიარეთ რეგისტრაცია", Toast.LENGTH_LONG).show()
            }
        }
    }
}
