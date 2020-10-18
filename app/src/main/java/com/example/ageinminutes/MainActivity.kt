package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDatePicker.setOnClickListener {
            Toast.makeText(this,"Button Works", Toast.LENGTH_LONG).show() }
    }

}

/*fun clickDatePicker(view: View) {

   // DatePickerDialog(this, DatePickerDialog, DatePickerDialog.OnDateSetListener())
    //2

}

 */
