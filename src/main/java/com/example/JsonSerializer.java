package com.example;

import com.google.gson.Gson;

public class JsonSerializer {
    private Gson gson;

    public JsonSerializer() {
        gson = new Gson();
    }

    public String serialize(Object object) {
        return gson.toJson(object);
    }

    public <T> T deserialize(String json, Class<T> type) {
        return gson.fromJson(json, type);
    }
}
