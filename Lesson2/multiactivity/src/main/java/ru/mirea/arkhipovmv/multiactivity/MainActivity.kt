package ru.mirea.arkhipovmv.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input: EditText=findViewById<EditText>(R.id.editTextText)
    }

    public fun onClickNewActivity(view: View) {
        val intent: Intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("key","MIREA Arkhipov Mathew Vadimovich")
        var input: EditText=findViewById<EditText>(R.id.editTextText)
        intent.putExtra("input",input.text.toString())
        startActivity(intent);
    }
}