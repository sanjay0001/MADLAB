package com.example.graphicalprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Size
import android.view.View



class Canvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint : Paint= Paint()
        paint.setColor(Color.BLACK)
        canvas?.drawPaint(paint)

        paint.setColor(Color.BLUE)
        paint.textSize=50f
        canvas?.drawLine(520f,850f,520f,1150f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("LINE", 510f, 830f, paint);


        paint.setColor(Color.WHITE)
        paint.textSize=60f
        canvas?.drawCircle(200f,350f,150f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("CIRCLE", 130f, 180f, paint);


        paint.setColor(Color.RED)
        paint.textSize=60f
        canvas?.drawRect(50f,850f,350f,1150f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("RECTANGLE", 420f, 140f, paint);

        paint.setColor(Color.YELLOW)
        paint.textSize=60f
        canvas?.drawRect(400f,150f,650f,700f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("SQUARE", 120f, 800f, paint);


        paint.setColor(Color.GREEN)
        paint.textSize=60f
        canvas?.drawOval(500f,2000f,800f,1500f,paint)
        paint.setColor(Color.WHITE)
        canvas?.drawText("OVAL", 580f, 1490f, paint);
    }
}