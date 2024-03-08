package com.example;

public class RequestResponse {
    private String requestName;
    private String requestType;
    private String responseName;
    private String responseType;
    
    public RequestResponse(String requestName, String requestType, String responseName, String responseType) {
        this.requestName = requestName;
        this.requestType = requestType;
        this.responseName = responseName;
        this.responseType = responseType;
    }
    
    public String getRequestName() {
        return requestName;
    }
    
    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
    
    public String getRequestType() {
        return requestType;
    }
    
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
    
    public String getResponseName() {
        return responseName;
    }
    
    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }
    
    public String getResponseType() {
        return responseType;
    }
    
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
}
