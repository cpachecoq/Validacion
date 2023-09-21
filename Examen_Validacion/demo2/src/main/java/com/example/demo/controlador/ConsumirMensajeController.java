package com.example.demo.controlador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ConsumirMensajeController {

    @Value("${microservicio1.url}")
    private String microservicio1Url; // La URL del primer microservicio

    @GetMapping("/consume")
    public String obtenerMensajeDelMicroservicio1() {
        RestTemplate restTemplate = new RestTemplate();
        String mensaje = restTemplate.getForObject(microservicio1Url + "/api/saludo", String.class);
        return mensaje;
    }
}
