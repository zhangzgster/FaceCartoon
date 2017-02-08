package com.sion.facecartoon;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.sion.facecartoon.model.DetectResult;
import com.sion.facecartoon.network.api.FaceDetect;
import com.sion.facecartoon.network.api.NetworkUtil;
import com.sion.facecartoon.view.FaceDetectView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import rx.Subscriber;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;
    Button choose_button, location_button,analyze_button, cartoon_button;

    private Bitmap bitmap;

    private Subscriber detectSubscriber;
    private DetectResult detectFaceResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
        choose_button = (Button) findViewById(R.id.choose_button);
        location_button = (Button) findViewById(R.id.location_button);
        analyze_button=(Button)findViewById(R.id.analyze_button);
        cartoon_button = (Button) findViewById(R.id.cartoon_button);
        choose_button.setOnClickListener(this);
        location_button.setOnClickListener(this);
        analyze_button.setOnClickListener(this);
        cartoon_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.choose_button:
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setDataAndType(MediaStore.Images.Media.INTERNAL_CONTENT_URI, "image/*");
                intent.putExtra("crop", "true");
                intent.putExtra("aspectX", 3);// 裁剪框比例
                intent.putExtra("aspectY", 4);
                intent.putExtra("outputX", 240);// 输出图片大小
                intent.putExtra("outputY", 320);
                startActivityForResult(intent, 1);
                break;
            case R.id.location_button:
                getDetectResult();
                break;
            case R.id.analyze_button:
                showFaceAnalyze();
                break;
        }

    }

    private void getDetectResult() {
        detectSubscriber = new Subscriber<DetectResult>() {

            @Override
            public void onCompleted() {
                Log.e("COMPLETED", "COMPLETED");
            }

            @Override
            public void onError(Throwable e) {
                Log.e("ERROR", e.toString());
            }

            @Override
            public void onNext(DetectResult detectResult) {
                detectFaceResult = detectResult;
                showFaceDetect();
            }
        };
        if (bitmap == null) {
            Toast.makeText(this, "请选择一张图片", Toast.LENGTH_SHORT).show();
        } else {
            //图片保存路径
            String imageDir = Environment.getExternalStorageDirectory().getPath() + "/FaceCartoonImages";
            //图片名称
            String fileName = "image.png";
            //创建图片路径
            File fileDir = new File(imageDir);
            if (!fileDir.exists()) {
                fileDir.mkdir();
            }
            //创建文件
            File imageFile = new File(fileDir, fileName);
            try {
                FileOutputStream fos = new FileOutputStream(imageFile);
                boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
                fos.flush();
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            NetworkUtil.getInstance().getFaceDetectResult(detectSubscriber, constants.api_key, constants.api_secret, imageFile);
        }

    }

    private void showFaceDetect() {
        Intent intent = new Intent();
        intent.setClass(this, FaceDetectActivity.class);
        intent.putExtra("detectResult", detectFaceResult);
        intent.putExtra("bitmap", bitmap);
        startActivity(intent);
    }

    private void showFaceAnalyze(){
        Intent intent = new Intent();
        intent.setClass(this, FaceAnalyzeActivity.class);
        intent.putExtra("detectResult", detectFaceResult);
        intent.putExtra("bitmap", bitmap);
        startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null && data.getExtras() != null) {
            bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
