package com.example.demo.controlador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Saludo;


@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/message")
    public Saludo obtenerSaludo() {
        return new Saludo("Hola UPS:");
    }
}