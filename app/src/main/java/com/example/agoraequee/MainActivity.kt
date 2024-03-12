package com.example.agoraequee
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.agoraequee.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_at1)

        val buttonOpenAT2 = findViewById<Button>(R.id.buttonOpenAT2)

        buttonOpenAT2.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))

        }
    }
}