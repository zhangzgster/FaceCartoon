package com.sion.facecartoon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sion.facecartoon.model.DetectResult;
import com.sion.facecartoon.network.api.FaceDetect;
import com.sion.facecartoon.view.FaceDetectView;

public class FaceDetectActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_detect);

        imageView = (ImageView) findViewById(R.id.image_view);

        Intent intent=getIntent();
        DetectResult detectResult= (DetectResult) intent.getSerializableExtra("detectResult");
        Bitmap bitmap=intent.getParcelableExtra("bitmap");

        Bitmap detectBitmap=getDetectBitmap(detectResult,bitmap);
        imageView.setImageBitmap(detectBitmap);

    }

    private Bitmap getDetectBitmap(DetectResult detectResult,Bitmap bitmap){
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        Bitmap newBitmap=Bitmap.createBitmap(w,h, Bitmap.Config.ARGB_8888);
        Canvas cv=new Canvas(newBitmap);
        cv.drawBitmap(bitmap,0,0,null);

        DetectResult.FacesBean.FaceRectangleBean faceRectangleBean=detectResult.getFaces().get(0).getFace_rectangle();
        Paint paint=new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        cv.drawRect(faceRectangleBean.getLeft(),
                faceRectangleBean.getTop(),
                faceRectangleBean.getLeft()+faceRectangleBean.getWidth(),
                faceRectangleBean.getTop()+faceRectangleBean.getHeight(),paint);
        cv.save(Canvas.ALL_SAVE_FLAG);
        cv.restore();
        return newBitmap;
    }
}
