package com.skb.pushservice.controller;

import com.skb.pushservice.domain.Exist.ExistDto;
import com.skb.pushservice.domain.WatchInfo.WatchInfoDto;
import com.skb.pushservice.service.ConnectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NotificationController {

    private final ConnectService connectService;

    public NotificationController(ConnectService connectService) {
        this.connectService = connectService;
    }

    @RequestMapping("/")
    public String index() {
        return "index here";
    }

    @RequestMapping("/notifications")
    public String notifications() {
        return "notifications here";
    }

    @PostMapping("/send")
    @ResponseBody
    public ResponseEntity<?> send(@RequestBody WatchInfoDto.Request req) {
        connectService.connectUser(req);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/force")
    public ResponseEntity<?> forceConnect(@RequestBody ExistDto.Request req) {
        connectService.forceConnect(req);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping("/stop")
    public ResponseEntity<?> stopConnect(@RequestBody WatchInfoDto.Request req) {
        connectService.stopConnect(req);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
