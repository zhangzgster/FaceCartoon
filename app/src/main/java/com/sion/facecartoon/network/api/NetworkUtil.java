package com.sion.facecartoon.network.api;

import com.sion.facecartoon.model.AnalyzeResult;
import com.sion.facecartoon.model.DetectResult;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Scheduler;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Administrator on 2017/2/8 0008.
 */

public class NetworkUtil {
    public static final String BASE_URL="https://api-cn.faceplusplus.com/facepp/v3/";
    private static final int DEFAULT_TIMEOUT = 5;
    private Retrofit retrofit;

    private FaceDetect faceDetect;
    private FaceAnalyze faceAnalyze;

    private static class SingletonHolder{
        private static final NetworkUtil INSTANCE=new NetworkUtil();
    }

    public static NetworkUtil getInstance(){return SingletonHolder.INSTANCE;}

    private NetworkUtil(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS);

        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        faceDetect=retrofit.create(FaceDetect.class);
        faceAnalyze=retrofit.create(FaceAnalyze.class);
    }

    public void getFaceDetectResult(Subscriber<DetectResult> subscriber, String api_key, String api_secret, File image_file){
        RequestBody requestApiKey = RequestBody.create(MediaType.parse("multipart/form-data"), api_key);
        RequestBody requestApiSecret = RequestBody.create(MediaType.parse("multipart/form-data"), api_secret);

        // 创建RequestBody，传入参数："multipart/form-data"，File
        RequestBody requestImgFile = RequestBody.create(MediaType.parse("multipart/form-data"), image_file);
        // 创建MultipartBody.Part，用于封装文件数据
        MultipartBody.Part requestImgPart =
                MultipartBody.Part.createFormData("image_file", image_file.getName(), requestImgFile);

        faceDetect.getDetectResult(requestApiKey,requestApiSecret,requestImgPart)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    public void getFaceAnalyzeResult(Subscriber<AnalyzeResult> subscriber,String api_key,
                                     String api_secret,String face_tokens, int return_landmark){
        faceAnalyze.getAnalyzeResult(api_key,api_secret,face_tokens,return_landmark)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }
}
