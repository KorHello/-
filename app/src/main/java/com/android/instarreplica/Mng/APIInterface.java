package com.android.instarreplica.Mng;

import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIInterface {
    @POST("cmm/test.dmapi")
    Call<ResultParsing> getVersionInfo(@Header("appCode") String appCode);

}
