package com.example.appdeliveryfood.Controlador;

import com.example.appdeliveryfood.Cliente.ContabilidadRepository;
import com.example.appdeliveryfood.Cliente.RabbitAPI;
import com.example.appdeliveryfood.Modelo.Contabilidad;
import com.example.appdeliveryfood.Modelo.NotificationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;

import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class NotificationService {
    @Autowired
    private  RabbitAPI rabbitAPI;
    @Autowired
    private ContabilidadRepository contabilidadRepository;

    public NotificationService(RabbitAPI rabbitAPI,ContabilidadRepository contabilidadRepository){
        this.rabbitAPI = rabbitAPI;
        this.contabilidadRepository = contabilidadRepository;

    }
    @PostMapping("/noti")
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationData data) {
        rabbitAPI.sendNotification(data);

        Contabilidad contabilidad = new Contabilidad();
        contabilidad.setIngreso(data.getIngreso());
        contabilidad.setConcepto(data.getBody()); // Asegúrate de que NotificationData tenga un campo 'concepto'
        contabilidad.setFecha(new Date()); // O utiliza el campo de fecha de NotificationData si está disponible
        contabilidadRepository.save(contabilidad);
        return ResponseEntity.ok().build(); // Devolver una respuesta HTTP con código 200 OK
    }

}
