package com.example.administrator.management;

import android.app.DownloadManager;
import android.app.VoiceInteractor;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-06-15.
 */

public class DeleteRequest extends StringRequest {

    final static private String URL = "http://came1230.cafe24.com/Delete.php";
    private Map<String,String> parameters;

    public DeleteRequest(String userID , Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID",userID);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}
