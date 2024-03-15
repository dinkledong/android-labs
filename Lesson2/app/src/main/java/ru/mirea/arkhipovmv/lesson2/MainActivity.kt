package ru.mirea.arkhipovmv.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onCreate: aaa")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: aaa2")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onStart: aaa2")
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.i(TAG, "onRestoreInstanceState: awpoiduia")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onRestoreInstanceState: awpoiduia")

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "onSaveInstanceState: dipwa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onSaveInstanceState: dipwa")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onResume: bbb")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onPause: ccc")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onStop: ddd")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onDestroy: eee")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: aaa")
        var text : TextView = findViewById(R.id.edit_text);
        text.setText("onRestart: fff")
    }
}