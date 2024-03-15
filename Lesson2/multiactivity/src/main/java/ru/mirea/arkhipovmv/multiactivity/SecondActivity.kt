package ru.mirea.arkhipovmv.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var text:String=intent.getStringExtra("key").toString()
        var textview =findViewById<TextView>(R.id.textView)
        textview.setText(text)

        var text2:String=intent.getStringExtra("input").toString()
        var textview2 =findViewById<TextView>(R.id.textView2)
        textview2.setText(text2)
    }
}