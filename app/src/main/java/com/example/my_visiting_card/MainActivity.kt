package com.example.my_visiting_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHyperlink()
    }
    fun setupHyperlink() {
        val linkTextView = findViewById<TextView>(R.id.textView4)
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        val linkgit = findViewById<TextView>(R.id.github)
        linkgit.setMovementMethod(LinkMovementMethod.getInstance());
        val linktwitter = findViewById<TextView>(R.id.twitter)
        linktwitter.setMovementMethod(LinkMovementMethod.getInstance());
        val linklinkedin = findViewById<TextView>(R.id.linkedin)
        linklinkedin.setMovementMethod(LinkMovementMethod.getInstance());

    }

}
