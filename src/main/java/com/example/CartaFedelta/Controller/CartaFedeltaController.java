package com.example.CartaFedelta.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CartaFedeltaController {

    @GetMapping("/")
    public String paginaIniziale() {
        return "inizio";
    }

    @GetMapping("/azienda")
    public String azienda() {
        return "aziendaHome";
    }

    @GetMapping("/cliente")
    public String cliente() {
        return "clienteHome";
    }
}