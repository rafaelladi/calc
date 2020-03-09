package br.ufpr.tads.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ad = findViewById<Button>(R.id.buttonAd)
        val su = findViewById<Button>(R.id.buttonSu)
        val mu = findViewById<Button>(R.id.buttonMu)
        val di = findViewById<Button>(R.id.buttonDi)

        ad.setOnClickListener {
            val textField1 = findViewById<EditText>(R.id.editText)
            val textField2 = findViewById<EditText>(R.id.editText2)
            val n1 = textField1.text.toString().toInt()
            val n2 = textField2.text.toString().toInt()
            val res = n1 + n2;
            Toast.makeText(this, "$res", Toast.LENGTH_LONG).show()
        }

        su.setOnClickListener {
            val textField1 = findViewById<EditText>(R.id.editText)
            val textField2 = findViewById<EditText>(R.id.editText2)
            val n1 = textField1.text.toString().toInt()
            val n2 = textField2.text.toString().toInt()
            val res = n1 - n2;
            Toast.makeText(this, "$res", Toast.LENGTH_LONG).show()
        }

        mu.setOnClickListener {
            val textField1 = findViewById<EditText>(R.id.editText)
            val textField2 = findViewById<EditText>(R.id.editText2)
            val n1 = textField1.text.toString().toInt()
            val n2 = textField2.text.toString().toInt()
            val res = n1 * n2;
            Toast.makeText(this, "$res", Toast.LENGTH_LONG).show()
        }

        di.setOnClickListener {
            val textField1 = findViewById<EditText>(R.id.editText)
            val textField2 = findViewById<EditText>(R.id.editText2)
            val n1 = textField1.text.toString().toInt()
            val n2 = textField2.text.toString().toInt()
            val res = n1 / n2;
            Toast.makeText(this, "$res", Toast.LENGTH_LONG).show()
        }

    }
}
