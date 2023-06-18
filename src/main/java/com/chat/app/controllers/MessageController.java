package com.chat.app.controllers;

import com.chat.app.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try{
            //processing here: to save the message in db
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return message;
    }

}
