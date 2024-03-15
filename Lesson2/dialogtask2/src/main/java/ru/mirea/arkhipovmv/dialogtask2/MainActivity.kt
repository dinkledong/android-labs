package ru.mirea.arkhipovmv.dialogtask2

import ProgressDialogFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowDateDialog(view: View) =
        DateDialogFragment().show(supportFragmentManager, "mirea")

    fun onClickShowProgressDialog(view: View) =
        ProgressDialogFragment().show(supportFragmentManager, "mirea")

    fun onClickShowTimeDialog(view: View) =
        TimeDialogFragment().show(supportFragmentManager, "mirea")

    fun callbackTime(view: View, hour: Int, minute: Int) =
        Snackbar.make(findViewById(android.R.id.content), "Time selected: $hour:$minute",
            Snackbar.LENGTH_LONG).show()

    fun callbackDate(view: View, year: Int, month: Int, dayOfMonth: Int) =
        Snackbar.make(findViewById(android.R.id.content), "Date selected: $dayOfMonth.$month.$year",
            Snackbar.LENGTH_LONG).show()
}