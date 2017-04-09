package com.example.vo;

/**
 * WebSocketResponse
 * 服务器向浏览器传送消息，用该类进行传送
 */
public class WebSocketResponse {

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    private String responseMessage;

    public WebSocketResponse(){}

    public WebSocketResponse(String responseMessage){
        this.responseMessage = responseMessage;
    }

}
