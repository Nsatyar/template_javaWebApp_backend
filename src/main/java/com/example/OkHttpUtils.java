// COMMENT
package com.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class OkHttpUtils {
    private static OkHttpClient client = new OkHttpClient();
    
    public static Response sendRequest(Request request) throws IOException {
        return client.newCall(request).execute();
    }
    
    public static String handleResponse(Response response) throws IOException {
        return response.body().string();
    }
}
