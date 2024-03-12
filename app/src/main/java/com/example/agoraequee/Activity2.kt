package com.example.agoraequee
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.agoraequee.R



class Activity2 :  AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at2)

        val buttonCloseAT2 = findViewById<Button>(R.id.buttonCloseAT2)

        buttonCloseAT2.setOnClickListener {
            finish()
        }
    }
}