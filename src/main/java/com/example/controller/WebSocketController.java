package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.vo.WebSocketMessage;
import com.example.vo.WebSocketResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * WebSocketController 控制类
 */
@RestController
public class WebSocketController {
    //@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @MessageMapping("/welcome")
    //如果服务器接受到了消息，就会对订阅了@SendTo括号中的地址传送消息。
    @SendTo("/topic/getResponse")
    public String  say(WebSocketMessage message) throws Exception {
        WebSocketResponse responseMessage =  new WebSocketResponse("Welcome, " + message.getName() + "!");
        System.out.println(JSON.toJSONString(responseMessage));
        return JSON.toJSONString(responseMessage).toString();
    }

}
