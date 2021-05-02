package dev.happysingh.happytoast

import android.content.Context

fun Context.showToast(msg: String) {
    HappyToast.showToast(this, msg)
}

fun Context.showLongToast(msg: String) {
    HappyToast.showLongToast(this, msg)
}