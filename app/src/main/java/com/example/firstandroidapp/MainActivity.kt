package com.example.firstandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, "Hello, toast!", Toast.LENGTH_SHORT)
        toast.show()
    }

    fun count(view: View) {
        val counterTextView = findViewById<TextView>(R.id.textView)
        val countValue = counterTextView.text.toString()
        var count = Integer.parseInt(countValue)
        count++
        counterTextView.text = count.toString()
    }

    fun random(view: View) {
        val newIntent = Intent(this, RandomActivity::class.java)
        val counterTextView = findViewById<TextView>(R.id.textView)
        val countValue = counterTextView.text.toString()
        var count = Integer.parseInt(countValue)
        newIntent.putExtra(RandomActivity.TOTAL_COUNT, count)
        startActivity(newIntent)
    }
}
