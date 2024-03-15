package ru.mirea.arkhipovmv.toastapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createToast(view: View){
        var text = findViewById<EditText>(R.id.editTextText)
        var num = text.text.length
        var toast:Toast = Toast.makeText(applicationContext,
            "СТУДЕНТ №2 ГРУППА БСБО-11-21; СИМВОЛЫ - "+num.toString(),
            Toast.LENGTH_SHORT)
        toast.show()
    }
}