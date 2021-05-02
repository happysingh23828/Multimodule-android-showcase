package dev.happysingh.multimodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.happysingh.happytoast.HappyToast
import dev.happysingh.happytoast.showToast
import dev.happysingh.string_formatter.Formatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // from formatter module
        val msg = Formatter.getHelloWorld()

        // toast
        HappyToast.showLongToast(this,msg)

        // toast - extension
        showToast(msg)
    }
}