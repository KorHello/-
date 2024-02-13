package com.android.instarreplica.Mng;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class ResultParsing {

    @SerializedName("resCode")
    String resCode;
    @SerializedName("resMsg")
    String resMsg;
    @SerializedName("data")
    JsonObject  data; // 응애

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public JsonObject getData() {
        return data;
    }

    public void setData(JsonObject data) {
        this.data = data;
    }
}
