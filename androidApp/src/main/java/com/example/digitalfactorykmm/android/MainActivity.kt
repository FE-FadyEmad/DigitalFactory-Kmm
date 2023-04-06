package com.example.digitalfactorykmm.android

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<ScreenViewModel>()

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        viewModel.liveDate.observe(this) {
            textView.text = it
        }
        viewModel.getData()
    }
}
