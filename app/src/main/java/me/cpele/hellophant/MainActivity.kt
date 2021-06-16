package me.cpele.hellophant

import Hello
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greeting: String = Hello.hello()
        Toast.makeText(this, greeting, Toast.LENGTH_SHORT).show()
    }
}