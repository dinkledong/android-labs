package ru.mirea.arkhipovmv.buttonclicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnNotMe:Button
    lateinit var btnMe:Button
    lateinit var text:TextView
    lateinit var switch:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMe=findViewById(R.id.btnWhoAmI)
        btnNotMe=findViewById(R.id.btnItIsNotMe)
        text=findViewById(R.id.text)
        switch=findViewById(R.id.switch1)

        btnMe.setOnClickListener{
            text.setText("Мой номер по списку - 2")
        }

        btnNotMe.setOnClickListener{
            text.setText("Это был не я")
            Toast.makeText(this,"That wasn't me",Toast.LENGTH_LONG).show()
            switch.setChecked(!switch.isChecked)
        }
    }

    fun onItsNotMeClick(view: View) {
        Toast.makeText(this,"That wasn't me",Toast.LENGTH_LONG).show()
        switch.setChecked(!switch.isChecked)
    }

    fun onNotMeClick(view: View) {
        Toast.makeText(this,"That wasn't me",Toast.LENGTH_LONG).show()
        switch.setChecked(!switch.isChecked)
    }


}