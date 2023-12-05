package com.example.introandroidclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var btnView: MaterialButton? = null
    private var tapCounter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
    }

    private fun initializeView() {
        try {
            textView = findViewById(R.id.txtTapOutput)
            btnView = findViewById(R.id.btnTap)
            btnView?.setOnClickListener {
                tapCounter++
                textView.text = tapCounter.toString()
                if (tapCounter >= 6) {
                    Toast.makeText(
                        this, getString(R.string.now_a_wema_developer),
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(
                        this, getString(R.string.becoming_a_developer, 6-tapCounter),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        } catch (e: Exception) {
            e.localizedMessage?.let { Log.e("initializeView", it) }
        }
    }
}