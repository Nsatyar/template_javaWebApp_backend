package com.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpRequestHandler {
    private OkHttpClient client;

    public HttpRequestHandler() {
        client = new OkHttpClient();
    }

    public String sendGetRequest(String url) throws Exception {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
