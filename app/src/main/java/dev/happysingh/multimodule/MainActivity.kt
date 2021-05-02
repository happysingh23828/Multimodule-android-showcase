package dev.happysingh.multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.happysingh.string_formatter.Formatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // from formatter module
        Formatter.getHelloWorld()
    }
}