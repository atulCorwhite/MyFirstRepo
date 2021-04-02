package com.example.demoproject.view.utils

import android.content.Context
import android.widget.Toast

fun Context.displayShortToast(msg:String) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}

fun Context.displayLongToast(msg:String) {
    Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
}