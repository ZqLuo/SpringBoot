package com.example.vo;

/**
 * WebSocketMessage
 * 浏览器向服务器传送消息，用该类进行接收
 */
public class WebSocketMessage {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
