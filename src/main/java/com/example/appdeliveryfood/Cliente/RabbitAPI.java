package com.example.appdeliveryfood.Cliente;

import com.example.appdeliveryfood.Modelo.NotificationData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Rabbit",url="http://127.0.0.1:8000")
public interface RabbitAPI {
    @PostMapping("/notification")
    void sendNotification (@RequestBody NotificationData data);


}
