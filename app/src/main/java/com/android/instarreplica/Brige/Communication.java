package com.android.instarreplica.Brige;

import android.util.Log;
import android.widget.TextView;


import com.android.instarreplica.Mng.APIInterface;
import com.android.instarreplica.Mng.HttpClient;
import com.android.instarreplica.Mng.ResultParsing;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Communication {

    public static Communication shared = new Communication();

    public String testApi() {


        APIInterface apiInterface = HttpClient.getClient().create(APIInterface.class);

        Call<ResultParsing> callVerionCheck = apiInterface.getVersionInfo("DearMF_AOS");
        callVerionCheck.enqueue(new Callback<ResultParsing>() {

            @Override
            public void onResponse(Call<ResultParsing> call, Response<ResultParsing> response) {
                // 성공
                showMsg(response.body().getData().toString());
            }

            @Override
            public void onFailure(Call<ResultParsing> call, Throwable t) {
                // 실패

            }
        });

        return "";
    }

    public void showMsg(String result) {
        Log.i("HttpResult" , result);
    }
}
