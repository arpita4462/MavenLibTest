package com.gmediasolutions.samplelibrary

import android.content.Context
import android.graphics.Color
import android.widget.Toast
import android.view.Gravity
import android.view.View
import android.widget.TextView


fun showToast(c: Context, message: String) {

    val toast:Toast= Toast.makeText(c, message, Toast.LENGTH_SHORT)
    val toastView = toast.view// This'll return the default View of the Toast.

/* And now you can get the TextView of the default View of the Toast. */
    val toastMessage = toastView.findViewById(android.R.id.message) as TextView
    toastMessage.textSize = 15f
    toastMessage.setTextColor(Color.WHITE)
    toastMessage.setCompoundDrawablesWithIntrinsicBounds(R.drawable.credits, 0, 0, 0)
    toastMessage.gravity = Gravity.CENTER
    toastMessage.compoundDrawablePadding = 16
    toastView.setBackgroundColor(Color.GRAY)
    toast.show()
}

fun MsgDisplay(c: Context,Msg: String, Size: Int, Grav: Int) {
    val toast = Toast.makeText(c, Msg, Toast.LENGTH_LONG)
    val v = toast.view.findViewById<View>(android.R.id.message) as TextView
    v.setTextColor(Color.rgb(241, 196, 15))
    v.textSize = Size.toFloat()
    v.gravity = Gravity.CENTER
    v.setShadowLayer(1.5f, -1f, 1f, Color.BLACK)
    if (Grav == 1) {
        toast.setGravity(Gravity.BOTTOM, 0, 120)
    } else {
        toast.setGravity(Gravity.BOTTOM, 0, 10)
    }
    toast.show()
}
