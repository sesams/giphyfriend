package com.ks.giphyfriend.view.view

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.cardview.widget.CardView

class GifView : CardView {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    var gifWidth: Int = 0
    var gifHeight: Int = 0

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (gifWidth != 0 && gifHeight != 0) {
            val heightMode = MeasureSpec.getMode(heightMeasureSpec)
            val newHeight = (gifHeight * MeasureSpec.getSize(widthMeasureSpec)) / gifWidth
            val newSpec =
                MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(newHeight), heightMode)
            super.onMeasure(widthMeasureSpec, newSpec)
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }
    }
}