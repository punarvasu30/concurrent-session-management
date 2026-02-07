package com.skb.pushservice.service;


import com.skb.pushservice.domain.Exist.ExistDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    public void notifyUserExists(ExistDto.Response dto){
        simpMessagingTemplate.convertAndSendToUser(dto.getNewUser(),"/queue/notify",dto);
    }

    public void notifyDisconnect(ExistDto.Response dto){
        simpMessagingTemplate.convertAndSendToUser(dto.getExistUser(),"/queue/disconnect",dto);
    }

    public void notifySuccess(String user,String message){
        simpMessagingTemplate.convertAndSendToUser(user,"/queue/connect",message);
    }

}
