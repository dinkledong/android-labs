package ru.mirea.arkhipovmv.layouttype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    lateinit var button:Button
    lateinit var checkbox:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.main_text)
        button=findViewById(R.id.button14)
        checkbox=findViewById(R.id.checkBox2)

        text.setText("new text in mirea")
        button.setText("mirea button")
        checkbox.setChecked(true);
    }
}