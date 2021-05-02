package dev.happysingh.app_admin

import androidx.appcompat.app.AppCompatActivity
import dev.happysingh.happytoast.HappyToast

class AdminActivity : AppCompatActivity() {

    override fun setContentView(layoutResID: Int) {
        super.setContentView(layoutResID)
        setContentView(R.layout.activity_admin)

        // HappyToast
        HappyToast.showLongToast(this,"Hello World")
    }
}