package ru.mirea.arkhipovmv.intentfilter2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openBrowser(view: View){
        var address:Uri = Uri.parse("https:/www.mirea.ru/")
        var openLinkIntent: Intent = Intent(Intent.ACTION_VIEW,address)
        startActivity(openLinkIntent);
    }
    fun sendInfo(view: View){
        var shareIntent:Intent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/plain")
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"MIREA")
        shareIntent.putExtra(Intent.EXTRA_TEXT,"ARKHIPOV MATHEW VADIMOVICH")
        startActivity(Intent.createChooser(shareIntent,"MY NAME"))
    }
}