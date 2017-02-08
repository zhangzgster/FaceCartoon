package com.sion.facecartoon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.sion.facecartoon.model.AnalyzeResult;
import com.sion.facecartoon.model.DetectResult;
import com.sion.facecartoon.network.api.NetworkUtil;

import rx.Subscriber;

public class FaceAnalyzeActivity extends AppCompatActivity {

    ImageView imageView;

    private Bitmap bitmap;
    private DetectResult detectResult;
    private AnalyzeResult analyzeFaceResult;
    private Subscriber analyzeSubsriber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_analyze);

        imageView = (ImageView) findViewById(R.id.image_view);

        Intent intent=getIntent();
        detectResult= (DetectResult) intent.getSerializableExtra("detectResult");
        bitmap=intent.getParcelableExtra("bitmap");

        getAnalyzeResult();
    }

    private void getAnalyzeResult(){
        analyzeSubsriber=new Subscriber<AnalyzeResult>() {

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(AnalyzeResult analyzeResult) {
                analyzeFaceResult=analyzeResult;
                imageView.setImageBitmap(getAnalyzeBitmap(analyzeFaceResult,bitmap));
            }
        };
        NetworkUtil.getInstance().getFaceAnalyzeResult(analyzeSubsriber,constants.api_key,
                constants.api_secret,detectResult.getFaces().get(0).getFace_token(),1);
    }

    private Bitmap getAnalyzeBitmap(AnalyzeResult analyzeResult,Bitmap bitmap){
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        Bitmap newBitmap=Bitmap.createBitmap(w,h, Bitmap.Config.ARGB_8888);
        Canvas cv=new Canvas(newBitmap);
        cv.drawBitmap(bitmap,0,0,null);

        AnalyzeResult.FacesBean.LandmarkBean lm=analyzeResult.getFaces().get(0).getLandmark();
        Paint paint=new Paint();
        paint.setColor(Color.BLUE);
        cv.drawPoint(lm.getContour_chin().getX(),lm.getContour_chin().getY(),paint);

        cv.drawPoint(lm.getContour_left1().getX(),lm.getContour_left1().getY(),paint);
        cv.drawPoint(lm.getContour_left2().getX(),lm.getContour_left2().getY(),paint);
        cv.drawPoint(lm.getContour_left3().getX(),lm.getContour_left3().getY(),paint);
        cv.drawPoint(lm.getContour_left4().getX(),lm.getContour_left4().getY(),paint);
        cv.drawPoint(lm.getContour_left5().getX(),lm.getContour_left5().getY(),paint);
        cv.drawPoint(lm.getContour_left6().getX(),lm.getContour_left6().getY(),paint);
        cv.drawPoint(lm.getContour_left7().getX(),lm.getContour_left7().getY(),paint);
        cv.drawPoint(lm.getContour_left8().getX(),lm.getContour_left8().getY(),paint);
        cv.drawPoint(lm.getContour_left9().getX(),lm.getContour_left9().getY(),paint);

        cv.drawPoint(lm.getContour_right1().getX(),lm.getContour_right1().getY(),paint);
        cv.drawPoint(lm.getContour_right2().getX(),lm.getContour_right2().getY(),paint);
        cv.drawPoint(lm.getContour_right3().getX(),lm.getContour_right3().getY(),paint);
        cv.drawPoint(lm.getContour_right4().getX(),lm.getContour_right4().getY(),paint);
        cv.drawPoint(lm.getContour_right5().getX(),lm.getContour_right5().getY(),paint);
        cv.drawPoint(lm.getContour_right6().getX(),lm.getContour_right6().getY(),paint);
        cv.drawPoint(lm.getContour_right7().getX(),lm.getContour_right7().getY(),paint);
        cv.drawPoint(lm.getContour_right8().getX(),lm.getContour_right8().getY(),paint);
        cv.drawPoint(lm.getContour_right9().getX(),lm.getContour_right9().getY(),paint);

        cv.drawPoint(lm.getLeft_eye_bottom().getX(),lm.getLeft_eye_bottom().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_center().getX(),lm.getLeft_eye_center().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_left_corner().getX(),lm.getLeft_eye_left_corner().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_lower_left_quarter().getX(),lm.getLeft_eye_lower_left_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_lower_right_quarter().getX(),lm.getLeft_eye_lower_right_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_pupil().getX(),lm.getLeft_eye_pupil().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_right_corner().getX(),lm.getLeft_eye_right_corner().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_top().getX(),lm.getLeft_eye_top().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_upper_left_quarter().getX(),lm.getLeft_eye_upper_left_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eye_upper_right_quarter().getX(),lm.getLeft_eye_upper_right_quarter().getY(),paint);

        cv.drawPoint(lm.getLeft_eyebrow_left_corner().getX(),lm.getLeft_eyebrow_left_corner().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_lower_left_quarter().getX(),lm.getLeft_eyebrow_lower_left_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_lower_middle().getX(),lm.getLeft_eyebrow_lower_middle().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_lower_right_quarter().getX(),lm.getLeft_eyebrow_lower_right_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_right_corner().getX(),lm.getLeft_eyebrow_right_corner().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_upper_left_quarter().getX(),lm.getLeft_eyebrow_upper_left_quarter().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_upper_middle().getX(),lm.getLeft_eyebrow_upper_middle().getY(),paint);
        cv.drawPoint(lm.getLeft_eyebrow_upper_right_quarter().getX(),lm.getLeft_eyebrow_upper_right_quarter().getY(),paint);

        cv.drawPoint(lm.getMouth_left_corner().getX(),lm.getMouth_left_corner().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_bottom().getX(),lm.getMouth_lower_lip_bottom().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_left_contour1().getX(),lm.getMouth_lower_lip_left_contour1().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_left_contour2().getX(),lm.getMouth_lower_lip_left_contour2().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_left_contour3().getX(),lm.getMouth_lower_lip_left_contour3().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_right_contour1().getX(),lm.getMouth_lower_lip_right_contour1().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_right_contour2().getX(),lm.getMouth_lower_lip_right_contour2().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_right_contour3().getX(),lm.getMouth_lower_lip_right_contour3().getY(),paint);
        cv.drawPoint(lm.getMouth_lower_lip_top().getX(),lm.getMouth_lower_lip_top().getY(),paint);
        cv.drawPoint(lm.getMouth_right_corner().getX(),lm.getMouth_right_corner().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_bottom().getX(),lm.getMouth_upper_lip_bottom().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_left_contour1().getX(),lm.getMouth_upper_lip_left_contour1().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_left_contour2().getX(),lm.getMouth_upper_lip_left_contour2().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_left_contour3().getX(),lm.getMouth_upper_lip_left_contour3().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_right_contour1().getX(),lm.getMouth_upper_lip_right_contour1().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_right_contour2().getX(),lm.getMouth_upper_lip_right_contour2().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_right_contour3().getX(),lm.getMouth_upper_lip_right_contour3().getY(),paint);
        cv.drawPoint(lm.getMouth_upper_lip_top().getX(),lm.getMouth_upper_lip_top().getY(),paint);


        cv.drawPoint(lm.getNose_contour_left1().getX(),lm.getNose_contour_left1().getY(),paint);
        cv.drawPoint(lm.getNose_contour_left2().getX(),lm.getNose_contour_left2().getY(),paint);
        cv.drawPoint(lm.getNose_contour_left3().getX(),lm.getNose_contour_left3().getY(),paint);
        cv.drawPoint(lm.getNose_contour_lower_middle().getX(),lm.getNose_contour_lower_middle().getY(),paint);
        cv.drawPoint(lm.getNose_contour_right1().getX(),lm.getNose_contour_right1().getY(),paint);
        cv.drawPoint(lm.getNose_contour_right2().getX(),lm.getNose_contour_right2().getY(),paint);
        cv.drawPoint(lm.getNose_contour_right3().getX(),lm.getNose_contour_right3().getY(),paint);
        cv.drawPoint(lm.getNose_left().getX(),lm.getNose_left().getY(),paint);
        cv.drawPoint(lm.getNose_right().getX(),lm.getNose_right().getY(),paint);
        cv.drawPoint(lm.getNose_tip().getX(),lm.getNose_tip().getY(),paint);

        cv.drawPoint(lm.getRight_eye_bottom().getX(),lm.getRight_eye_bottom().getY(),paint);
        cv.drawPoint(lm.getRight_eye_center().getX(),lm.getRight_eye_center().getY(),paint);
        cv.drawPoint(lm.getRight_eye_left_corner().getX(),lm.getRight_eye_left_corner().getY(),paint);
        cv.drawPoint(lm.getRight_eye_lower_left_quarter().getX(),lm.getRight_eye_lower_left_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eye_lower_right_quarter().getX(),lm.getRight_eye_lower_right_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eye_pupil().getX(),lm.getRight_eye_pupil().getY(),paint);
        cv.drawPoint(lm.getRight_eye_right_corner().getX(),lm.getRight_eye_right_corner().getY(),paint);
        cv.drawPoint(lm.getRight_eye_top().getX(),lm.getRight_eye_top().getY(),paint);
        cv.drawPoint(lm.getRight_eye_upper_left_quarter().getX(),lm.getRight_eye_upper_left_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eye_upper_right_quarter().getX(),lm.getRight_eye_upper_right_quarter().getY(),paint);

        cv.drawPoint(lm.getRight_eyebrow_left_corner().getX(),lm.getRight_eyebrow_left_corner().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_lower_left_quarter().getX(),lm.getRight_eyebrow_lower_left_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_lower_middle().getX(),lm.getRight_eyebrow_lower_middle().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_lower_right_quarter().getX(),lm.getRight_eyebrow_lower_right_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_right_corner().getX(),lm.getRight_eyebrow_right_corner().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_upper_left_quarter().getX(),lm.getRight_eyebrow_upper_left_quarter().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_upper_middle().getX(),lm.getRight_eyebrow_upper_middle().getY(),paint);
        cv.drawPoint(lm.getRight_eyebrow_upper_right_quarter().getX(),lm.getRight_eyebrow_upper_right_quarter().getY(),paint);

        cv.save(Canvas.ALL_SAVE_FLAG);
        cv.restore();
        return newBitmap;
    }
}
