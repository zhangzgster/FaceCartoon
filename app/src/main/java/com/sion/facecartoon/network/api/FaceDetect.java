package com.sion.facecartoon.network.api;

import com.sion.facecartoon.model.DetectResult;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public interface FaceDetect {
    @Multipart
    @POST("detect")
    Observable<DetectResult> getDetectResult(@Part("api_key") RequestBody request_api_key,
                                             @Part("api_secret") RequestBody request_api_secret,
                                             @Part MultipartBody.Part request_img_part);
}
