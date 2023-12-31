package com.witzeal.pagination.common

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import com.witzeal.pagination.R


fun ImageView.loadImageWithGlide(context: Context, imageURL: String) {
    //I don't have a proper URL, so for now I am using images from Drawable only.
    this.setImageResource(R.drawable.circle_icon)
//    Glide.with(context)
//        .load(imageURL)
//        .thumbnail(Glide.with(context).load(R.raw.load))
//        .into(this)
}

fun String.showCustomToast(context: Context, duration: Int = Toast.LENGTH_LONG) {
    Toast.makeText(context, this, duration).show()
}
fun View.hide() {
    this.visibility = View.GONE
}

fun View.show() {
    this.visibility = View.VISIBLE
}
fun <T> LiveData<T>.observeOnce(lifecycleOwner: LifecycleOwner, observer: Observer<T>) {
    observe(lifecycleOwner, object : Observer<T> {
        override fun onChanged(t: T?) {
            observer.onChanged(t)
            removeObserver(this)
        }
    })
}