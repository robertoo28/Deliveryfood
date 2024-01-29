package com.example.appdeliveryfood.Modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationData {
    private String title;
    private String body;
    private String email;
    private double ingreso;

    public NotificationData() {
    }

    public NotificationData(String title, String body, String email, double ingreso) {
        this.title = title;
        this.body = body;
        this.email = email;
        this.ingreso = ingreso;
    }
}
