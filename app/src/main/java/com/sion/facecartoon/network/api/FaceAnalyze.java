package com.sion.facecartoon.network.api;

import com.sion.facecartoon.model.AnalyzeResult;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/2/8 0008.
 */

public interface FaceAnalyze {
   @POST("face/analyze")
   Observable<AnalyzeResult> getAnalyzeResult(@Query("api_key") String api_key,
                                              @Query("api_secret") String api_secret,
                                              @Query("face_tokens") String face_tokens,
                                              @Query("return_landmark") int return_landmark);
}
