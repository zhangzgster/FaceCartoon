package com.sion.facecartoon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.sion.facecartoon.model.DetectResult;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class FaceDetectView extends View {

    DetectResult detectResult;
    Bitmap bitmap;


    public FaceDetectView(Context context, DetectResult detectResult, Bitmap bitmap) {
        super(context);
        this.detectResult = detectResult;
        this.bitmap = bitmap;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(240,320);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (detectResult != null) {
            Paint paint = new Paint();
            canvas.drawBitmap(bitmap, 0, 0, paint);

            Paint paint_black = new Paint();                   //绘制黑色的环
            paint_black.setColor(Color.BLACK);
            paint_black.setStrokeWidth(10);
            canvas.drawCircle(245, 150, 60, paint_black);

        }
    }


}
