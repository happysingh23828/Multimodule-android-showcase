package dev.happysingh.happytoast

import android.content.Context
import android.widget.Toast


object HappyToast {

    fun showLongToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun showToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}